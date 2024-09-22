package com.example.shopping.service;

import com.example.shopping.model.Category;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {

	  Category saveCategory(Category category);

	  Boolean existCategory(String name);

	  List<Category> getAllCategory();

	  Boolean deleteCategory(int id);

	  Category getCategoryById(int id);

	  List<Category> getAllActiveCategory();

	  Page<Category> getAllCategorPagination(Integer pageNo,Integer pageSize);

}
