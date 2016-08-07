package org.khmeracademy.v3.repository.user;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.v3.entities.user.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

	@Select("SELECT * FROM tbllog WHERE logid=#{id}")
	boolean findByid(int id);

	@Select("SELECT userid, " + "email, " + "username, " + "gender, " + "dateofbirth, " + "phonenumber, "
			+ "registerdate, " + "userimageurl, " + "usertypeid, " + "point, " + "universityid, " + "departmentid  "
			+ " FROM tbluser WHERE username=#{username} AND password=#{password} AND status=1")
	User findByUserNameAndPassword(@Param("username") String username, @Param("password") String password);

	
	
	@Select("SELECT userid, " + "email, " + "username, " + "gender, " + "dateofbirth, " + "phonenumber, "
			+ "registerdate, " + "userimageurl, " + "usertypeid, " + "point, " + "universityid, " +"departmentid, "
			+ "userstatus " + " FROM tbluser ")
	@Results({
		@Result(property="userId" 	     ,column="userid"),
		@Result(property="email"        ,column="email"),
		@Result(property="username"    , column="username"),
		@Result(property="gender"    ,column="gender"),
		@Result(property="dateOfBirth" ,column="dateofbirth"),
		@Result(property="phoneNumber" ,column="phonenumber"),
		@Result(property="registerDate" ,column="registerdate"),
		@Result(property="userImageUrl" ,column="userimageurl"),
		@Result(property="username" ,column="usertypeid"),
		@Result(property="point" ,column="point"),
		@Result(property="universityId" , column="universityid"),
		@Result(property="departmentId" ,column="departmentid"),
		@Result(property="userStatus" ,column="userstatus")
	})
	ArrayList<User> findAllUser();

	
	
	@Insert("INSERT INTO tbluser(email ," + "password ," + "username ," + "gender ," + "dateofbirth ," + "phonenumber ,"
			+ "registerdate ," + "userimageurl ," + "usertypeid ," + "point ," + "universityid ," + "departmentid ,"
			+ "userstatus)"
			+ " values(#{email},#{password},#{username},#{gender},#{dateOfBirth},#{phoneNumber},#{registerDate},"
			+ "#{userImageUrl},#{userTypeId},#{point},#{universityId},#{departmentId},#{userStatus})")
	User insert(User user);

	@Delete("DELETE FROM tbluser WHERE userid=#{id}")
	boolean delete(int id);

	@Update("UPDATE tbluser SET email=#{email} ," + "password=#{password} ," + "username=#{username} ,"
			+ "gender=#{gender} ," + "dateofbirth=#{dateOfBirth} ," + "phonenumber=#{phoneNumber} ,"
			+ "registerdate=#{ registerDate} ," + "userimageurl=#{userImageUrl} ," + "usertypeid=#{userTypeId} ,"
			+ "point=#{point} ," + "universityid=#{universityId} ," + "departmentid=#{departmentId} ,"
			+ " userStatus=1  ")
	User updateUser(User user);
}
