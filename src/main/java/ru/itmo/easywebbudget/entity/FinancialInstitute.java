package ru.itmo.easywebbudget.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "FinancialInstitute")
public class FinancialInstitute implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private Integer bic;
    private Boolean isActual;
    private String comments;

    @OneToMany (mappedBy = "financialInstitute", cascade = CascadeType.ALL)
    Set<Account> financialInstitutes = new HashSet<>();

    public FinancialInstitute() {
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

    public Integer getBic() {
        return bic;
    }

    public void setBic(Integer bic) {
        this.bic = bic;
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
        return "FinancialInstitute{" +
                "id=" + id +
                '}';
    }
}
