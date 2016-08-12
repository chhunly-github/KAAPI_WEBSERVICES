package org.khmeracademy.v3.repository.user;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.v3.entities.user.University;

public interface UniversityRepository {
	

	@Select("SELECT universityid , universityname FROM ka_university")
	public ArrayList<University> getAllUniversity();

	@Select("SELECT * FROM ka_university WHERE universityid=#{id}")
	ArrayList<University> findAllUniversityID(@Param("id") int id);

	@Insert("INSERT INTO ka_university(universityid," + "universityname)"
			+ " values(#{universityid},#{universityname})")
	public University Save(University university);

	@Delete("DELETE FROM ka_university WHERE universityid=#{id}")
	public boolean delete(int id);

	@Update("UPDATE ka_university SET universityname=#{usertypename}" + " WHERE universityid=#{id}")
	public boolean updateUniversity(int id);
}
