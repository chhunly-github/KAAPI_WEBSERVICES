package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.user.Department;
import org.khmeracademy.v3.entities.user.University;
import org.khmeracademy.v3.repository.user.DepartmentRepository;
import org.khmeracademy.v3.services.user.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository DepartmentRepo;
	@Override
	public ArrayList<Department> listDepartment() {
		// TODO Auto-generated method stub
		return DepartmentRepo.getAllDepartment();
	}

	@Override
	public ArrayList<Department> FindByUserID(int id) {
		// TODO Auto-generated method stub
		return DepartmentRepo.findAllDepartmentID(id);
	}

	@Override
	public Department AddNew(Department department) {
		// TODO Auto-generated method stub
		return DepartmentRepo.Save(department);
		
	}

	@Override
	public boolean Delete(int id) {
		// TODO Auto-generated method stub
		return DepartmentRepo.delete(id);
	}

	@Override
	public boolean Update(Department department) {
		// TODO Auto-generated method stub
		return DepartmentRepo.updateDepartment(department);
	}

	



}
