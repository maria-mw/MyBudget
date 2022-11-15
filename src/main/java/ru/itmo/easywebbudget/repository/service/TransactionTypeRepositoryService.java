package ru.itmo.easywebbudget.repository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import ru.itmo.easywebbudget.entity.Budget;
import ru.itmo.easywebbudget.entity.TransactionType;
import ru.itmo.easywebbudget.repository.TransactionTypeRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class TransactionTypeRepositoryService implements TransactionTypeRepository {
    @Autowired
    private TransactionTypeRepository transactionTypeRepository;

    @Override                  //Save Transaction Type
    public <S extends TransactionType> S save(S entity) {
        return transactionTypeRepository.save(entity);
    }

    @Override                 //Display All Transaction Types
    public List<TransactionType> findAll() {
        return transactionTypeRepository.findAll();
    }

    @Override
    public List<TransactionType> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<TransactionType> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<TransactionType> findAllById(Iterable<Integer> integers) {
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
    public void delete(TransactionType entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends TransactionType> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends TransactionType> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TransactionType> findById(Integer integer) {
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
    public <S extends TransactionType> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends TransactionType> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<TransactionType> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public TransactionType getOne(Integer integer) {
        return null;
    }

    @Override
    public TransactionType getById(Integer integer) {
        return null;
    }

    @Override
    public TransactionType getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends TransactionType> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends TransactionType> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TransactionType> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TransactionType> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TransactionType> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TransactionType> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends TransactionType, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
