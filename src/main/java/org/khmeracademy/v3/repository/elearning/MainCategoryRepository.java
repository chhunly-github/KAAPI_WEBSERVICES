package org.khmeracademy.v3.repository.elearning;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.v3.entities.elearning.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface MainCategoryRepository {
	  
	
	@Select("SELECT videocategoryid ,"
			+ "categoryname ,"
			+ "categorylogourl ,"
			+ "categoryorder ,"
			+ "bgimage ,"
			+ "color ,"
			+ "hasmaincategoryid FROM ka_allvideocategory  "
			+ "WHERE status ='t'")
	public ArrayList<Category> findAllMainCategory();
	
	
	@Insert("INSERT INTO ka_allvideocategory("
			+ "videocategoryid ,"
			+ "categoryname ,"
			+ "categorylogourl ,"
			+ "categoryorder ,"
			+ "bgimage ,"
			+ "color ,"
			+ "hasmaincategoryid) VALUES (#{videocategoryid} ,"
			+ "#{categoryname} ,"
			+ "#{categorylogourl} ,"
			+ "#{categoryorder} ,"
			+ "#{bgimage} ,"
			+ "#{color} ,"
			+ "#{hasmaincategoryid})")
	public boolean addNewCategory(Category category);
	
	
	@Update("UPDATE ka_allvideocategory SET videocategoryid=#{videocategoryid} ,"
			+ "categoryname=#{categoryname} ,"
			+ "categorylogourl=#{categorylogourl} ,"
			+ "categoryorder=#{categoryorder} ,"
			+ "bgimage=#{bgimage} ,"
			+ "color=#{color} ,"
			+ "status=#{status},hasmaincategoryid=#{hasmaincategoryid}")
	boolean updateCategory(Category category);
	
	
	
	@Update("update ka_allvideocategory set status = 'f'WHERE videocategoryid =#{id}")
	boolean deleteCategory(@Param("id")int id);
}
