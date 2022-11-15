package ru.itmo.easywebbudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itmo.easywebbudget.entity.Transaction;


public interface TransactionRepository extends JpaRepository<Transaction, Integer> {


}
