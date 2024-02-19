package com.example.northwind.business.concretes;
import com.example.northwind.business.abstracts.CategoryService;
import com.example.northwind.core.utilities.result.*;
import com.example.northwind.dataAccess.CategoryDao;
import com.example.northwind.entities.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;
    @Override
    public DataResult<List<Category>> getAll() {

        return new SuccessDataResult<>("Ugurla listelendi", this.categoryDao.findAll()) ;

    }

    @Override
    public Result add(Category category) {
        this.categoryDao.save(category);
        return new SuccessResult("Ugurla save olundu.");
    }

    @Override
    public DataResult<Category> findByCategoryNameAndDescription(String categoryName, String description) {
        Category category = this.categoryDao.findByCategoryNameAndDescription(categoryName, description);
        if (category == null){
            return new ErrorDataResult<>("Bele adda category yoxdur.");
        }
        else {return new SuccessDataResult<>("Ugurla tapildi.", category);}
    }

    @Override
    public DataResult<Category> findByCategoryName(String categoryName) {
        Category category = this.categoryDao.findByCategoryName(categoryName);

        if (category == null){
            return new ErrorDataResult<>("Bele adda category yoxdur.");
        }
        else {return new SuccessDataResult<>("Ugurla tapildi.", category);}
}

    @Override
    public DataResult<Category> findByCategoryNameAndUnitPrice(String categoryName, int unitPrice) {
        return null;
    }

}




