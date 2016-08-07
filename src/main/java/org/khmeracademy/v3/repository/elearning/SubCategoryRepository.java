package org.khmeracademy.v3.repository.elearning;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.khmeracademy.v3.entities.elearning.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCategoryRepository {

	
	@Select("SELECT videocategoryid ,"
			+ "categoryname ,"
			+ "categorylogourl ,"
			+ "categoryorder ,"
			+ "bgimage ,"
			+ "color ,"
			+ "hasmaincategoryid FROM ka_allvideocategory  "
			+ "WHERE hasmaincategoryid =#{id}")
	public ArrayList<Category> findAllSubCategory(@Param("id")int mainid);
}


