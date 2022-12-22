package com.javaProjects.myBudget.controller;

import com.javaProjects.myBudget.dto.CategorySubcategoriesDTO;
import com.javaProjects.myBudget.entity.Category;
import com.javaProjects.myBudget.entity.Type;
import com.javaProjects.myBudget.services.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@RestController
public class MapController {

    @Autowired
    private MapService mapService;

    @GetMapping("/listCategorySubcategory")
//@ResponseBody
    public String getAllCategorySubcategories(Model model) {
        List<CategorySubcategoriesDTO> categorySubcategories = mapService.getAllCategorySubcategories();
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
