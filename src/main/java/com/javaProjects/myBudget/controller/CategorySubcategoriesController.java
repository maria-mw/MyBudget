package com.javaProjects.myBudget.controller;

import com.javaProjects.myBudget.dto.CategorySubcategoriesDTO;
import com.javaProjects.myBudget.services.CategorySubcategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
//@RestController
public class CategorySubcategoriesController {

    @Autowired
    private CategorySubcategoriesService categorySubcategoriesService;

    @GetMapping("/listCategorySubcategory")
//@ResponseBody
    public String getAllCategorySubcategories(Model model) {
        List<CategorySubcategoriesDTO> categorySubcategories = categorySubcategoriesService.getAllCategorySubcategories();
        model.addAttribute("list", categorySubcategories);
        return "listCategorySubcategoryPage";
    }

//    @GetMapping("/map")
//    @ResponseBody
//    public List<CategorySubcategoriesDTO> getAllCategorySubcategories() {
//        List<CategorySubcategoriesDTO> categorySubcategories = mapService.getAllCategorySubcategories();
//        return categorySubcategories;
//    }

}
