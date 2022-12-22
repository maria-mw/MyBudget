package com.javaProjects.myBudget.controller;

import com.javaProjects.myBudget.dto.CategorySubcategoriesDTO;
import com.javaProjects.myBudget.services.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MapController {

    @Autowired
    private MapService mapService;

    @GetMapping("/map")
    @ResponseBody
    public List<CategorySubcategoriesDTO> getAllCategorySubcategories() {
        List<CategorySubcategoriesDTO> categorySubcategories = mapService.getAllCategorySubcategories();
        return categorySubcategories;
    }
}