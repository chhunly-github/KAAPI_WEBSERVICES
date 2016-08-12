package org.khmeracademy.v3.services.user;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.user.Department;

public interface DepartmentService {
	public ArrayList<Department>listDepartment();
	public ArrayList<Department>FindByUserID(int id);
	public Department AddNew(Department department);
	public boolean Delete(int id);
	public boolean Update(Department department);
}
