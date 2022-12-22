package com.javaProjects.myBudget.repository;

import com.javaProjects.myBudget.entity.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;


@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory, Integer> {
}
