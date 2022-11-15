package ru.itmo.easywebbudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.itmo.easywebbudget.entity.CurrencyType;

public interface CurrencyTypeRepository extends JpaRepository<CurrencyType, Integer> {

}
