package com.javaProjects.myBudget.services;

import com.javaProjects.myBudget.dto.CategorySubcategoriesDTO;
import com.javaProjects.myBudget.entity.Category;
import com.javaProjects.myBudget.entity.SubCategory;
import com.javaProjects.myBudget.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapService   {
    @Autowired
    private SubCategoryRepositoryService subCategoryRepositoryService;

    public List<CategorySubcategoriesDTO> getAllCategorySubcategories() {
        return ((List<SubCategory>)subCategoryRepositoryService
                .findAll())
                .stream()
                .map(this::convertToCategorySubcategoriesDTO)
                .collect(Collectors.toList());
    }

    private CategorySubcategoriesDTO convertToCategorySubcategoriesDTO(SubCategory subCategory) {
        CategorySubcategoriesDTO categorySubcategoriesDTO = new CategorySubcategoriesDTO();
        categorySubcategoriesDTO.setId(subCategory.getId());
        categorySubcategoriesDTO.setSubCategoryTitle(subCategory.getTitle());
        Category category = subCategory.getCategory();
        categorySubcategoriesDTO.setCategoryTitle(category.getTitle());
        Type type = category.getType();
        categorySubcategoriesDTO.setCategoryType(type.getTitle());
        return categorySubcategoriesDTO;
    }



}
