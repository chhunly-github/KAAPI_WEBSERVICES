package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Category;
import org.khmeracademy.v3.repository.elearning.SubCategoryRepository;
import org.khmeracademy.v3.services.elearning.findSubCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class findAllSubCategoryImpl implements findSubCategory {

	@Autowired
	private SubCategoryRepository subCategoryRepo;

	@Override
	public ArrayList<Category> findAllSubCategory(int id) {
		return subCategoryRepo.findAllSubCategory(id);
	}

}
