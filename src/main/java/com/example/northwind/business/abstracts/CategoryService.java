package com.example.northwind.business.abstracts;

import com.example.northwind.core.utilities.result.DataResult;
import com.example.northwind.core.utilities.result.Result;
import com.example.northwind.entities.Category;

import java.util.List;

public interface  CategoryService {
    DataResult<List<Category>> getAll();

    Result add(Category category);

    DataResult<Category> findByCategoryNameAndDescription(String categoryName, String description);

    DataResult<Category> findByCategoryName(String categoryName);
    DataResult<Category> findByCategoryNameAndUnitPrice(String categoryName, int unitPrice);

}



