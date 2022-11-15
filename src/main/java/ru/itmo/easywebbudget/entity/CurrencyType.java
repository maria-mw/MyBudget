package ru.itmo.easywebbudget.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CurrencyType")
public class CurrencyType implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private Boolean isActual;
    private String comments;

    @OneToMany (mappedBy = "currencyType", cascade = CascadeType.ALL)
    Set<Account> accountCurrencyTypes = new HashSet<>();

    @OneToMany (mappedBy = "currencyType", cascade = CascadeType.ALL)
    Set<Budget> budgetCurrencyTypes = new HashSet<>();

    public CurrencyType() {
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "CurrencyType{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
