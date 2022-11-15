package ru.itmo.easywebbudget.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.itmo.easywebbudget.entity.AccountType;

public interface AccountTypeRepository extends JpaRepository<AccountType, Integer> {

}
