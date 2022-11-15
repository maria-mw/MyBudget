package ru.itmo.easywebbudget.repository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import ru.itmo.easywebbudget.entity.AccountType;
import ru.itmo.easywebbudget.repository.AccountTypeRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class AccountTypeRepositoryService implements AccountTypeRepository {
    @Autowired
    private AccountTypeRepository accountTypeRepository;

    @Override                        //Save Account Types.
    public <S extends AccountType> S save(S entity) {
        return accountTypeRepository.save(entity);
    }

    @Override                        //Display All Account Types.
    public List<AccountType> findAll() {
        return accountTypeRepository.findAll();
    }

    @Override
    public List<AccountType> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<AccountType> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<AccountType> findAllById(Iterable<Integer> integers) {
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
    public void delete(AccountType entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends AccountType> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends AccountType> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<AccountType> findById(Integer integer) {
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
    public <S extends AccountType> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends AccountType> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<AccountType> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public AccountType getOne(Integer integer) {
        return null;
    }

    @Override
    public AccountType getById(Integer integer) {
        return null;
    }

    @Override
    public AccountType getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends AccountType> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends AccountType> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends AccountType> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends AccountType> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends AccountType> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends AccountType> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends AccountType, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
