package com.javaProjects.myBudget.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "currency")
public class Currency implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String title;

    private String comments;

    @OneToMany (mappedBy = "currency", cascade = CascadeType.ALL)
    Set<Transaction> currency = new HashSet<>();


    public Currency() {
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


    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
