package ru.itmo.easywebbudget.repository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import ru.itmo.easywebbudget.entity.CurrencyType;
import ru.itmo.easywebbudget.repository.CurrencyTypeRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class CurrencyTypeRepositoryService implements CurrencyTypeRepository {
    @Autowired
    private CurrencyTypeRepository currencyTypeRepository;

    @Override                        //Save Currency Types.
    public <S extends CurrencyType> S save(S entity) {
        return currencyTypeRepository.save(entity);
    }
    @Override                        //Display All Currency Types.
    public List<CurrencyType> findAll() {
        return currencyTypeRepository.findAll();
    }

    @Override
    public List<CurrencyType> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CurrencyType> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<CurrencyType> findAllById(Iterable<Integer> integers) {
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
    public void delete(CurrencyType entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends CurrencyType> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends CurrencyType> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CurrencyType> findById(Integer integer) {
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
    public <S extends CurrencyType> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends CurrencyType> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<CurrencyType> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CurrencyType getOne(Integer integer) {
        return null;
    }

    @Override
    public CurrencyType getById(Integer integer) {
        return null;
    }

    @Override
    public CurrencyType getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends CurrencyType> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CurrencyType> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CurrencyType> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CurrencyType> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CurrencyType> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CurrencyType> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends CurrencyType, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
