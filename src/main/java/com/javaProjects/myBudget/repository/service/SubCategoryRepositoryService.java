package com.javaProjects.myBudget.repository.service;

import com.javaProjects.myBudget.entity.Category;
import com.javaProjects.myBudget.entity.SubCategory;
import com.javaProjects.myBudget.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class SubCategoryRepositoryService implements SubCategoryRepository {
    @Autowired
    private SubCategoryRepository subCategoryRepository;
    @Override                     //Save Category
    public <S extends SubCategory> S save(S entity) {
        return subCategoryRepository.save(entity);
    }

    @Override                     //Display Categories
    public List<SubCategory> findAll() {
        return subCategoryRepository.findAll();
    }


    @Override
    public List<SubCategory> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<SubCategory> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<SubCategory> findAllById(Iterable<Integer> integers) {
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
    public void delete(SubCategory entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends SubCategory> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends SubCategory> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<SubCategory> findById(Integer integer) {
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
    public <S extends SubCategory> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends SubCategory> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<SubCategory> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public SubCategory getOne(Integer integer) {
        return null;
    }

    @Override
    public SubCategory getById(Integer integer) {
        return null;
    }

    @Override
    public SubCategory getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends SubCategory> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends SubCategory> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends SubCategory> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends SubCategory> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends SubCategory> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends SubCategory> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends SubCategory, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}