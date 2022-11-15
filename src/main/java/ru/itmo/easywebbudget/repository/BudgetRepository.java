package ru.itmo.easywebbudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.itmo.easywebbudget.entity.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Integer> {

}
