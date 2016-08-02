package com.khmeracademy.forum.repositories.userRepository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import com.khmeracademy.forum.entities.User;

@Repository
public interface UserRepository {

	/*
	 * C_MAINCATEGORY create
	 *  read 
	 * U_MAINCATEGORY update
	 * D_MAINCATEGORY delete
	 */
	
	String C_User="INSERT INTO tbluser (userid,email,password,username,gender,dateofbirth,"
			+ "phonenumber,registerdate,userimageurl,usertypeid,point,universityid,departmentid,userstatus)"
			+ "VALUES(#{userid},#{email},#{password},#{username},#{gender},#{dateofbirth},#{phonenumber},#{registerdate},"
			+ "#{userimageurl},#{usertypeid},#{point},#{universityid},#{departmentid},#{userstatus})";
	
	String rs_User ="SELECT * FROM tbluser";
	
	String R_User ="SELECT * FROM tbluser WHERE userid=#{userid}";
	
	String U_User="UPDATE tbluser SET "
					+ "email=#{email},password=#{password},username=#{username},gender=#{gender},dateofbirth=#{dateofbirth},"
					+ "phonenumber=#{phonenumber},registerdate=#{registerdate},"
					+ "userimageurl=#{userimageurl},usertypeid=#{usertypeid},point=#{point},universityid=#{universityid},departmentid=#{departmentid},"
					+ "userstatus=#{userstatus} WHERE userid=#{userid}";
	
	String D_User ="DELETE FROM tbluser WHERE userid=#{userid}";
	
	
	
/*	@Results(value={
			  @Result(property ="userid" , column="user_id"),
			  @Result(property ="userid" , column="user_id"),
			  @Result(property ="userid" , column="user_id"),
			  @Result(property ="userid" , column="user_id"),
			  @Result(property ="userid" , column="user_id"),
			  @Result(property ="userid" , column="user_id"),
			  @Result(property ="userid" , column="user_id"),
			  
		})*/
	
	@Select(rs_User)
	public ArrayList<User> getAllUser();
	
	@Select(R_User)
	public User getUser(@Param("userid") int userid);
	
	@Insert(C_User)
	public boolean createUser(User user);
	
	@Update(U_User)
	public boolean updateUser(User user);
	
	@Delete(D_User)
	public boolean removeUser(@Param("userid") int userid);
}
