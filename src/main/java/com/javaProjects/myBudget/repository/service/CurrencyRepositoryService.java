package com.javaProjects.myBudget.repository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import com.javaProjects.myBudget.entity.Currency;
import com.javaProjects.myBudget.repository.CurrencyRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class CurrencyRepositoryService implements CurrencyRepository {
    @Autowired
    private CurrencyRepository currencyRepository;

    @Override                     //Save Currency
    public <S extends Currency> S save(S entity) {
        return currencyRepository.save(entity);
    }

    @Override                     //Display Currencies
    public List<Currency> findAll() {
        return currencyRepository.findAll();
    }


    @Override
    public List<Currency> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Currency> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Currency> findAllById(Iterable<Integer> integers) {
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
    public void delete(Currency entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Currency> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Currency> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Currency> findById(Integer integer) {
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
    public <S extends Currency> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Currency> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Currency> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Currency getOne(Integer integer) {
        return null;
    }

    @Override
    public Currency getById(Integer integer) {
        return null;
    }

    @Override
    public Currency getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Currency> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Currency> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Currency> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Currency> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Currency> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Currency> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Currency, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}