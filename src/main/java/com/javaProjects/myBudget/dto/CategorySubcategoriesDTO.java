package com.javaProjects.myBudget.dto;

import com.javaProjects.myBudget.entity.Type;

public class CategorySubcategoriesDTO {
    private Integer id;
    private String subCategoryTitle;
    private String categoryTitle;
    private String categoryType;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubCategoryTitle() {
        return subCategoryTitle;
    }

    public void setSubCategoryTitle(String subCategoryTitle) {
        this.subCategoryTitle = subCategoryTitle;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

}
