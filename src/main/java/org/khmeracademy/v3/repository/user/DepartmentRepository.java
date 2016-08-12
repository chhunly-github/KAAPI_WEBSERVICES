package org.khmeracademy.v3.repository.user;


import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.v3.entities.user.Department;
import org.khmeracademy.v3.entities.user.University;
import org.khmeracademy.v3.entities.user.UserType;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository {

	@Select("SELECT departmentid , departmentname FROM ka_department")
	public ArrayList<Department> getAllDepartment();

	@Select("SELECT * FROM ka_department WHERE departmentid=#{id}")
	ArrayList<Department> findAllDepartmentID(@Param("id") int id);

	@Insert("INSERT INTO ka_department(departmentid," + "departmentname)"
			+ " values(#{departmentid},#{departmentname})")
	public Department Save(Department department);

	@Delete("DELETE FROM ka_department WHERE departmentid=#{id}")
	public boolean delete(int id);

	@Update("UPDATE ka_department SET departmentname=#{departmentname}" + " WHERE departmentid=#{id}")
	public boolean updateDepartment(Department department);
	
}


