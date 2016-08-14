package org.khmeracademy.v3.repository.user;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.v3.entities.user.StudiedCourse;
import org.khmeracademy.v3.entities.user.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {



	@Select("SELECT userid, " 
			+ "email, " 
			+ "username, "
			+ "gender, "
			+ "dateofbirth, "
			+ "phonenumber, "
			+ "registerdate, "
			+ "userimageurl, "
			+ "usertypeid, "
			+ "point, "
			+ "universityid, "
			+ "departmentid "
			+ "FROM ka_user  "
			+ "WHERE username=#{username} AND password=#{password}  ")
	User findByUserNameAndPassword(@Param("username") String username, @Param("password") String password);

	@Select("SELECT userid,   "
			+ "email,  "
			+ "username,  "
			+ "gender,  "
			+ "dateofbirth,  "
			+ "phonenumber,  "
			+ "registerdate,  "
			+ "userimageurl,  "
			+ "usertypeid,  "
			+ "point,  "
			+ "universityid,  "
			+ "departmentid  "
			+ "FROM ka_user  "
			+ "WHERE userid=#{userid} ")
	@Results(value={
			@Result(property="userid", column="userid"),
			@Result(property="studiedcourse" , column="userid" , 
					many = @Many(select = "findStudiedCourseByUserId")),
	})
	public User findByUserId(@Param("userid") int userid);
	
	@Select("SELECT "
			+ "sc.playlistid, " 
			+ "sc.startdate, "
			+ "p.playlistname "
			+ "FROM ka_studied_course sc INNER JOIN ka_playlist p ON p.playlistid=sc.playlistid "
			+ "WHERE sc.userid=#{userid} ")
	ArrayList<StudiedCourse> findStudiedCourseByUserId(@Param("userid") int userid);
	
	@Select("SELECT "
			+ "userid, "
			+ "email, "
			+ "username, "
			+ "gender, "
			+ "dateofbirth, "
			+ "phonenumber, "
			+ "registerdate, "
			+ "userimageurl, "
			+ "usertypeid, "
			+ "point, "
			+ "universityid, "
			+"departmentid "
			+ " FROM ka_user")
	ArrayList<User> findAllUser();
	
	@Insert("INSERT INTO ka_user(userid ,email ,password ,username ,gender , "
			+ "dateofbirth ,phonenumber ,registerdate ,userimageurl ,usertypeid ,"
			+ "point ,universityid ,departmentid ) VALUES(#{userid},#{email},#{password},"
			+ "#{username},#{gender},"
			+ "#{dateofbirth},#{phonenumber},"
			+ "#{registerdate},#{userimageurl},"
			+ "#{usertypeid},#{point},#{universityid},#{departmentid})")
	boolean insert(User user);

	@Delete("UPDATE ka_user SET userstatus=#{userstatus} WHERE userid=#{id}")
	boolean deleteByAdmin(@Param("id")int id ,@Param("userstatus")int userstatus);
	
	@Delete("DELETE FROM ka_user "
			+ "WHERE username=#{username} AND password=#{password}")
	boolean deleteByUserNameAndPassword(@Param("username") String username,
			@Param("password") String password);

	@Update("UPDATE ka_user SET "
			+ "email=#{email} ,"
			+ "username=#{username} ,"
			+ "gender=#{gender} ,"
			+ "dateofbirth=#{dateofbirth} ,"
			+ "phonenumber=#{phonenumber} ,"
			+ "universityid=#{universityid} ,"
			+ "departmentid=#{departmentid} "
			+ "WHERE userid=#{userid}"
			)
	boolean updateUserInfoById(User user);
	
	@Update("UPDATE ka_user SET "
			+ "email=#{email} ,"
			+ "username=#{username} ,"
			+ "gender=#{gender} ,"
			+ "dateofbirth=#{dateofbirth} ,"
			+ "phonenumber=#{phonenumber} ,"
			+ "universityid=#{universityid} ,"
			+ "departmentid=#{departmentid} "
			+ "WHERE username=#{username} AND password=#{password}")
	boolean updateUserInfoByUsernameAndPassword(User user);
	
	@Update("UPDATE ka_user SET "
			+ "userimageurl=#{path} "
			+ "WHERE username=#{username}")
	boolean updateUserProfilePicture(@Param("path") String path,@Param("username") String username);
	
	@Update("UPDATE ka_user SET "
			+ "password=#{newpassword} "
			+ "WHERE password=#{oldpassword} AND username=#{username}")
	boolean updateUserPassword(@Param("username") String username,
					@Param("newpassword") String newpassword,
					@Param("oldpassword") String oldpassword);
	
	@Update("UPDATE ka_user SET point=#{point} WHERE username=#{username}")
	boolean updateUserPointByUsername(@Param("point") int point, @Param("username") String username);
}
