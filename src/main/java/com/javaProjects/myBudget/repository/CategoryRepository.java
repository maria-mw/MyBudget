package com.javaProjects.myBudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import com.javaProjects.myBudget.entity.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
