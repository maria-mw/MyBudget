package ru.itmo.easywebbudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.itmo.easywebbudget.entity.TransactionType;


public interface TransactionTypeRepository extends JpaRepository<TransactionType, Integer> {

}
