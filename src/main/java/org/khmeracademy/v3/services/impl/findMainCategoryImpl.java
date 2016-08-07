package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Category;
import org.khmeracademy.v3.repository.elearning.MainCategoryRepository;
import org.khmeracademy.v3.services.elearning.findMainCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class findMainCategoryImpl implements findMainCategory {

	@Autowired
	private MainCategoryRepository mainCategoryRepo;

	@Override
	public ArrayList<Category> findAllMainCategory() {
		return mainCategoryRepo.findAllMainCategory();
	}

}
