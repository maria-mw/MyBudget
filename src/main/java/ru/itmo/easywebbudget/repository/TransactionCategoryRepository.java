package ru.itmo.easywebbudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import ru.itmo.easywebbudget.entity.TransactionCategory;


@Repository
public interface TransactionCategoryRepository extends JpaRepository<TransactionCategory, Integer> {

    @Procedure(procedureName = "get_subcategories_by_category_id")
    String[][] getSubcategoriesByCategoryId(String categoryId);



}
