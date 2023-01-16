package com.javaProjects.myBudget.services;

import com.javaProjects.myBudget.entity.Category;
import com.javaProjects.myBudget.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import com.javaProjects.myBudget.entity.Transaction;
import com.javaProjects.myBudget.repository.TransactionRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class TransactionRepositoryService implements TransactionRepository {
    @Autowired
    private TransactionRepository transactionRepository;
//    List<Transaction> transactionsList = transactionRepository.findAll();


    @Override                     //Save Transaction
    public <S extends Transaction> S save(S entity) {
        return transactionRepository.save(entity);
    }

    @Override                     //Display Transactions
    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    @Override
    public List<Transaction> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Transaction> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Transaction> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Transaction entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Transaction> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Transaction> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Transaction> findById(Integer integer) {
        return transactionRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Transaction> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Transaction> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Transaction> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Transaction getOne(Integer integer) {
        return null;
    }

    @Override
    public Transaction getById(Integer integer) {
        Optional<Transaction> transaction = transactionRepository.findById(integer);
        return transaction.orElse(null);
    }

    @Override
    public Transaction getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Transaction> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Transaction> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Transaction> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Transaction> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Transaction> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Transaction> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Transaction, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    public List<Transaction> filterTransactionsByStatus(Integer status) {
        return findAll()
                .stream()
                .filter(t -> t.getStatus().getId().equals(status))
                .collect(Collectors.toList());
    }
    public List<Transaction> filterTransactionsByTypeAndStatus(Integer type, Integer status) {
        List<Transaction> transactionsByStatus = filterTransactionsByStatus(status);
        return transactionsByStatus
                .stream()
                .filter(t -> t.getSubCategory().getCategory().getType().getId().equals(type))
                .collect(Collectors.toList());
    }

    public List<Transaction> filterTransactionsByCategoryAndTypeAndStatus(Integer category, Integer type, Integer status) {
        List<Transaction> transactionsByTypeAndStatus = filterTransactionsByTypeAndStatus(type,status);
        return transactionsByTypeAndStatus
                .stream()
                .filter(t -> t.getSubCategory().getCategory().getId().equals(category))
                .collect(Collectors.toList());
    }

    public List<Transaction> filterTransactionsBySubCategoryAndCategoryAndTypeAndStatus(Integer subCategory,Integer category, Integer type, Integer status) {
        List<Transaction> transactionsByCategoryAndTypeAndStatus = filterTransactionsByCategoryAndTypeAndStatus (category,type,status);
        return transactionsByCategoryAndTypeAndStatus
                .stream()
                .filter(t -> t.getSubCategory().getId().equals(subCategory))
                .collect(Collectors.toList());
    }

    public String transactionsSum(List<Transaction> transactions) {
        int sum = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getSubCategory().getCategory().getType().getTitle().equals("Зачисление")){
                sum += transaction.getSum();
            }
            else {
                sum -= transaction.getSum();
            }
        }
        return String.valueOf(sum);
    }
}
