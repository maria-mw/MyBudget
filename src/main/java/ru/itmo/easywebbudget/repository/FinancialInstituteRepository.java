package ru.itmo.easywebbudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.itmo.easywebbudget.entity.FinancialInstitute;

public interface FinancialInstituteRepository extends JpaRepository<FinancialInstitute, Integer> {

}
