package com.javaProjects.myBudget.services;

import com.javaProjects.myBudget.dto.CategorySubcategoriesDTO;
import com.javaProjects.myBudget.entity.Category;
import com.javaProjects.myBudget.entity.SubCategory;
import com.javaProjects.myBudget.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javaProjects.myBudget.repository.service.SubCategoryRepositoryService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapService {
    @Autowired
    private SubCategoryRepositoryService categoryRepositoryService;


    public List<CategorySubcategoriesDTO> getAllCategorySubcategories() {
        return ((List<SubCategory>)categoryRepositoryService
                .findAll())
                .stream()
                .map(this::convertToCategorySubcategoriesDTO)
                    .collect(Collectors.toList());
    }

    private CategorySubcategoriesDTO convertToCategorySubcategoriesDTO(SubCategory category) {
        CategorySubcategoriesDTO categorySubcategoriesDTO = new CategorySubcategoriesDTO();
        categorySubcategoriesDTO.setId(category.getId());
        categorySubcategoriesDTO.setTitle(category.getTitle());
        Category subcategory = category.getCategory();
        categorySubcategoriesDTO.setSubcategory_title(subcategory.getTitle());
        Type type = subcategory.getType();
        categorySubcategoriesDTO.setCategory_type(type.getTitle());
        return categorySubcategoriesDTO;
    }
}
