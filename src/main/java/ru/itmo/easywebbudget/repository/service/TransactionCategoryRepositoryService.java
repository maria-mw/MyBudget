package ru.itmo.easywebbudget.repository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import ru.itmo.easywebbudget.entity.TransactionCategory;
import ru.itmo.easywebbudget.repository.TransactionCategoryRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class TransactionCategoryRepositoryService implements TransactionCategoryRepository {
    @Autowired
    private TransactionCategoryRepository transactionCategoryRepository;

    @Override
    public String[][] getSubcategoriesByCategoryId(String categoryId) {
        return new String[0][];
    }

    @Override                     //Save Transaction Category
    public <S extends TransactionCategory> S save(S entity) {
        return transactionCategoryRepository.save(entity);
    }

    @Override                     //Display All Transaction Categories
    public List<TransactionCategory> findAll() {
        return transactionCategoryRepository.findAll();
    }

    @Override
    public List<TransactionCategory> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<TransactionCategory> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<TransactionCategory> findAllById(Iterable<Integer> integers) {
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
    public void delete(TransactionCategory entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends TransactionCategory> entities) {

    }

    @Override
    public void deleteAll() {

    }



    @Override
    public <S extends TransactionCategory> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TransactionCategory> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends TransactionCategory> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends TransactionCategory> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<TransactionCategory> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public TransactionCategory getOne(Integer integer) {
        return null;
    }

    @Override
    public TransactionCategory getById(Integer integer) {
        return null;
    }

    @Override
    public TransactionCategory getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends TransactionCategory> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends TransactionCategory> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TransactionCategory> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TransactionCategory> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TransactionCategory> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TransactionCategory> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends TransactionCategory, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
