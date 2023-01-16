package com.javaProjects.myBudget.services;

import com.javaProjects.myBudget.entity.Currency;
import com.javaProjects.myBudget.entity.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import com.javaProjects.myBudget.entity.Type;
import com.javaProjects.myBudget.repository.TypeRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class TypeRepositoryService implements TypeRepository {
    @Autowired
    private TypeRepository typeRepository;

    @Override                     //Save Type
    public <S extends Type> S save(S entity) {
        return typeRepository.save(entity);
    }

    @Override                     //Display Types
    public List<Type> findAll() {
        return typeRepository.findAll();
    }


    @Override
    public List<Type> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Type> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Type> findAllById(Iterable<Integer> integers) {
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
    public void delete(Type entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Type> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Type> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Type> findById(Integer integer) {
        return typeRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Type> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Type> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Type> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Type getOne(Integer integer) {
        return null;
    }

    @Override
    public Type getById(Integer integer) {
        return findById(integer).orElse(null);
    }

    @Override
    public Type getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Type> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Type> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Type> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Type> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Type> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Type> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Type, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
