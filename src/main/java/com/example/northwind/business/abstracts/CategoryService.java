package com.example.northwind.business.abstracts;

import com.example.northwind.core.utilities.result.DataResult;
import com.example.northwind.entities.Category;

import java.util.List;

public interface  CategoryService {
    DataResult<List<Category>> getAll();
}


