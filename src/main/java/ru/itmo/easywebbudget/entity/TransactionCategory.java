package ru.itmo.easywebbudget.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TransactionCategory")
public class TransactionCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;

    @ManyToOne
    private TransactionType transactionType;

    private Boolean isActual;
    private String comments;

    @ManyToOne
    private TransactionCategory superCategory;


    @OneToMany (mappedBy = "transactionCategory", cascade = CascadeType.ALL)
    Set<Budget> budgetTransactionCategories = new HashSet<>();

    @OneToMany (mappedBy = "transactionCategory", cascade = CascadeType.ALL)
    Set<Transaction> transactionCategories = new HashSet<>();

    @OneToMany (mappedBy = "superCategory", cascade = CascadeType.ALL)
    Set<TransactionCategory> transactionSubCategories = new HashSet<>();

    public TransactionCategory() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getActual() {
        return isActual;
    }

    public void setActual(Boolean actual) {
        isActual = actual;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public TransactionCategory getSuperCategory() {
        return superCategory;
    }

    public void setSuperCategory(TransactionCategory subCategory) {
        this.superCategory = subCategory;
    }
}
