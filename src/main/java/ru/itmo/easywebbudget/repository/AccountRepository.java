package ru.itmo.easywebbudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.itmo.easywebbudget.entity.Account;


public interface AccountRepository extends JpaRepository<Account, Integer> {
}
