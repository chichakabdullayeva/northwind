package com.example.northwind.dataAccess;

import com.example.northwind.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {


    Category findByCategoryNameAndUnitPrice(String categoryName, int unitPrice);

    Category findByCategoryNameAndDescription(String categoryName, String description);

    Category findByCategoryName(String categoryName);
}



