package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Category;
import org.khmeracademy.v3.repository.elearning.CategoryRepository;
import org.khmeracademy.v3.services.elearning.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryrep;
	
	@Override
	public ArrayList<Category> findAllMainCategory() {
		// TODO Auto-generated method stub
		return categoryrep.findAllMainCategory();
	}

	@Override
	public boolean deleteCategoryById(int catid) {
		// TODO Auto-generated method stub
		return categoryrep.deleteCategory(catid);
	}

	@Override
	public boolean saveNewCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryrep.addNewCategory(category);
	}

	@Override
	public boolean updateCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryrep.updateCategory(category);
	}

	@Override
	public ArrayList<Category> findAllSubCategory(int mainid) {
		// TODO Auto-generated method stub
		return categoryrep.findAllSubCategory(mainid);
	}


}
