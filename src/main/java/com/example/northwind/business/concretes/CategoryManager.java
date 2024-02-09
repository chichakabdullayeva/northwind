package com.example.northwind.business.concretes;

import com.example.northwind.business.abstracts.CategoryService;
import com.example.northwind.business.abstracts.CategoryService;
import com.example.northwind.core.utilities.result.DataResult;
import com.example.northwind.core.utilities.result.SuccessDataResult;
import com.example.northwind.dataAccess.CategoryDao;
import com.example.northwind.dataAccess.CategoryDao;
import com.example.northwind.entities.Category;
import com.example.northwind.entities. Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {
    private CategoryDao categoryDaoDao;
    @Override
    public DataResult<List<Category>> getAll() {


        return new SuccessDataResult<>("Ugurla listelendi", this.categoryDaoDao.findAll());
    }
}

