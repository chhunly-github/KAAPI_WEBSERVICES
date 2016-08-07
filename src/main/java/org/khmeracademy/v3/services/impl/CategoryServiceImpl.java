package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Category;
import org.khmeracademy.v3.services.elearning.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Override
	public ArrayList<Category> findAllMainCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Category> findSubCategoryByMainCategoryId(int mainid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCategoryById(int catid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveNewCategory(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCategory(Category category) {
		// TODO Auto-generated method stub
		return false;
	}
	

	
}
