package org.khmeracademy.v3.repository.elearning;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.v3.entities.elearning.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository {
	  
	@Select("SELECT videocategoryid ,"
			+ "categoryname ,"
			+ "categorylogourl ,"
			+ "categoryorder ,"
			+ "bgimage ,"
			+ "color ,"
			+ "hasmaincategoryid FROM ka_allvideocategory  "
			+ "WHERE status ='t' and hasmaincategoryid is null ORDER BY categoryorder")
	@Results(value={
			@Result(property="videocategoryid", column="videocategoryid"),
			@Result(property="subCategory" , column="videocategoryid" , 
					many = @Many(select = "findAllSubCategory")),
	})
	ArrayList<Category> findAllMainCategory();
	
	@Select("SELECT videocategoryid ,"
			+ "categoryname ,"
			+ "categorylogourl ,"
			+ "categoryorder ,"
			+ "bgimage ,"
			+ "color "
			+ " FROM ka_allvideocategory "
			+ "WHERE status ='t' AND hasmaincategoryid=#{videocategoryid} ORDER BY categoryname")
	@Results(value={
			@Result(property="videocategoryid", column="videocategoryid"),
			@Result(property="subOfSubCategory" , column="videocategoryid" , 
					many = @Many(select = "findAllSubCategory"))
	})
	ArrayList<Category> findAllSubCategory(@Param("videocategoryid") int videocategoryid);
	
	/*@Select("SELECT videocategoryid ,"
			+ "categoryname ,"
			+ "categorylogourl ,"
			+ "categoryorder ,"
			+ "bgimage ,"
			+ "color "
			+ " FROM ka_allvideocategory "
			+ "WHERE status ='t' AND hasmaincategoryid=#{videocategoryid}")
	ArrayList<Category> findAllSubOfSubCategory(@Param("videocategoryid") int videocategoryid);
	*/
	
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
	boolean addNewCategory(Category category);
	
	
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
