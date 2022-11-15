package ru.itmo.easywebbudget.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Account")
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private FinancialInstitute financialInstitute;

    @ManyToOne
    private AccountType accountType;

    @ManyToOne
    private CurrencyType currencyType;

    private String comments;

    @OneToMany (mappedBy = "sourceAccount", cascade = CascadeType.ALL)
    Set<Transaction> sourceAccountTransactions = new HashSet<>();

    @OneToMany (mappedBy = "targetAccount", cascade = CascadeType.ALL)
    Set<Transaction> targetAccountTransactions = new HashSet<>();

    public Account() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FinancialInstitute getFinancialInstitute() {
        return financialInstitute;
    }

    public void setFinancialInstitute(FinancialInstitute financialInstitute) {
        this.financialInstitute = financialInstitute;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", financialInstitute=" + financialInstitute +
                ", accountType=" + accountType +
                ", currencyType=" + currencyType +
                ", comments='" + comments + '\'' +
                '}';
    }
}
