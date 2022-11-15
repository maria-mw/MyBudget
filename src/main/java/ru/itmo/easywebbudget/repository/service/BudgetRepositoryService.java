package ru.itmo.easywebbudget.repository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import ru.itmo.easywebbudget.entity.Budget;
import ru.itmo.easywebbudget.repository.BudgetRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class BudgetRepositoryService implements BudgetRepository {
    @Autowired
    private BudgetRepository budgetRepository;

    @Override                              //Save Budget Record
    public <S extends Budget> S save(S entity) {
        return budgetRepository.save(entity);
    }

    @Override                              //Display All Budget Records
    public List<Budget> findAll() {
        return budgetRepository.findAll();
    }

    @Override
    public List<Budget> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Budget> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Budget> findAllById(Iterable<Integer> integers) {
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
    public void delete(Budget entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Budget> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Budget> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Budget> findById(Integer integer) {
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
    public <S extends Budget> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Budget> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Budget> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Budget getOne(Integer integer) {
        return null;
    }

    @Override
    public Budget getById(Integer integer) {
        return null;
    }

    @Override
    public Budget getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Budget> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Budget> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Budget> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Budget> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Budget> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Budget> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Budget, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
