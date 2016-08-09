package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Category;
import org.khmeracademy.v3.repository.elearning.MainCategoryRepository;
import org.khmeracademy.v3.services.elearning.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private MainCategoryRepository mainCategory;

	@Override
	public ArrayList<Category> findAllMainCategory() {
		return mainCategory.findAllMainCategory();
	}

	/*
	 * @Override public ArrayList<Category> findSubCategoryByMainCategoryId(int
	 * mainid) { return mainCategory. }
	 */

	@Override
	public boolean deleteCategoryById(int catid) {
		return mainCategory.deleteCategory(catid);
	}

	@Override
	public boolean saveNewCategory(Category category) {
		return mainCategory.addNewCategory(category);
	}

	@Override
	public boolean updateCategory(Category category) {
		return mainCategory.updateCategory(category);
	}

}
