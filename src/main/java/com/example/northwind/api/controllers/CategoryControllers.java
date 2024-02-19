package com.example.northwind.api.controllers;

import com.example.northwind.business.abstracts.CategoryService;
import com.example.northwind.core.utilities.result.DataResult;
import com.example.northwind.core.utilities.result.Result;
import com.example.northwind.entities.Category;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryControllers {
    private CategoryService categoryService;
    @GetMapping("/getAll")
    public DataResult<List<Category>> getAll() {
        return this.categoryService.getAll();

    }
    @PostMapping("/add")
    public Result add(@RequestBody Category category){
        return this.categoryService.add(category);}

    @GetMapping("/find-by-product-name")
    public DataResult<Category> findByCategoryName(String categoryName){
        return this.categoryService.findByCategoryName(categoryName);
    }

}
