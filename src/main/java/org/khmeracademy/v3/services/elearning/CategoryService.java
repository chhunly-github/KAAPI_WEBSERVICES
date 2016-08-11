package org.khmeracademy.v3.services.elearning;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Category;

public interface CategoryService {
	
	ArrayList<Category> findAllMainCategory();
	/**
	 * 
	 * @param mainid
	 * @return
	 */
	boolean deleteCategoryById(int catid);
	/**
	 * 
	 * @param category
	 * @return
	 */
	boolean saveNewCategory(Category category);
	/**
	 * 
	 * @param category
	 * @return
	 */
	boolean updateCategory(Category category);
	/**
	 * 
	 * @param mainid
	 * @return
	 */
	ArrayList<Category> findAllSubCategory(int mainid);
}
