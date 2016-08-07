package org.khmeracademy.v3.services.elearning;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Category;

public interface CategoryService {
	
	ArrayList<Category> findAllMainCategory();
	ArrayList<Category> findSubCategoryByMainCategoryId(int mainid);
	boolean deleteCategoryById(int catid);
	boolean saveNewCategory(Category category);
	boolean updateCategory(Category category);
	
}
