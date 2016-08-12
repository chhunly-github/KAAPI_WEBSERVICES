package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.user.University;
import org.khmeracademy.v3.repository.user.UniversityRepository;
import org.khmeracademy.v3.services.user.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityImp implements UniversityService {
	@Autowired
	private UniversityRepository UniversityRepo;

	@Override
	public ArrayList<University> listUniversity() {
		return UniversityRepo.getAllUniversity();
	}

	@Override
	public ArrayList<University> FindByUserID(int id) {
		return UniversityRepo.findAllUniversityID(id);
	}

	@Override
	public University AddNew(University university) {
		return UniversityRepo.Save(university);
	}

	@Override
	public boolean Delete(int id) {
		return UniversityRepo.delete(id);
	}

	@Override
	public boolean Update(int id) {
		return UniversityRepo.updateUniversity(id);
	}

}
