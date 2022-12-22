package com.javaProjects.myBudget.dto;

import com.javaProjects.myBudget.entity.Type;

public class CategorySubcategoriesDTO {
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

    public String getSubcategory_title() {
        return subcategory_title;
    }

    public void setSubcategory_title(String subcategory_title) {
        this.subcategory_title = subcategory_title;
    }

    private Integer id;
    private String title;

    private String subcategory_title;

    public String getCategory_type() {
        return category_type;
    }

    public void setCategory_type(String category_type) {
        this.category_type = category_type;
    }

    private String category_type;
}
