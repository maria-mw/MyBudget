package ru.itmo.easywebbudget.repository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import ru.itmo.easywebbudget.entity.FinancialInstitute;
import ru.itmo.easywebbudget.repository.FinancialInstituteRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class FinancialInstituteRepositoryService implements FinancialInstituteRepository {
    @Autowired
    private FinancialInstituteRepository financialInstituteRepository;

    @Override                                      //Save Financial Institutes.
    public <S extends FinancialInstitute> S save(S entity) {
        return financialInstituteRepository.save(entity);
    }
    @Override                                    //Display All Financial Institutes.
    public List<FinancialInstitute> findAll() {
        return financialInstituteRepository.findAll();
    }

    @Override
    public List<FinancialInstitute> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<FinancialInstitute> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<FinancialInstitute> findAllById(Iterable<Integer> integers) {
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
    public void delete(FinancialInstitute entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends FinancialInstitute> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends FinancialInstitute> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<FinancialInstitute> findById(Integer integer) {
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
    public <S extends FinancialInstitute> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends FinancialInstitute> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<FinancialInstitute> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public FinancialInstitute getOne(Integer integer) {
        return null;
    }

    @Override
    public FinancialInstitute getById(Integer integer) {
        return null;
    }

    @Override
    public FinancialInstitute getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends FinancialInstitute> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends FinancialInstitute> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends FinancialInstitute> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends FinancialInstitute> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends FinancialInstitute> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends FinancialInstitute> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends FinancialInstitute, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
