package org.khmeracademy.v3.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.v3.entities.user.UserType;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository {

	
	@Select("SELECT * FROM tblusertype WHERE usertypeid=#{id}")
	UserType findByid(int id);
	
	
	@Select("SELECT tblusertype.commentable ,"
			+ "tblusertype.deleteable ,"
			+ "tblusertype.postable ,"
			+ "tblusertype.userable ,"
			+ "tblusertype.usertypeid ,"
			+ "tblusertype.usertypename ,"
			+ "tblusertype.viewable "
			+ "FROM tbluser INNER JOIN "
			+ "tblusertype ON tblusertype.usertypeid = tbluser.usertypeid")
	public UserType findByUserId(int id);
	
	
	
	@Select("SELECT * FROM tblusertype ")
	ArrayList<UserType> findAllUserType();
	
	
	
	@Insert("INSERT INTO tblusertype(usertypeid ,"
			+ "usertypename ,"
			+ "viewable ,"
			+ "commentable ,"
			+ "postable ,"
			+ "deleteable ,"
			+ "userable)"
			+ " values(#{usertypeid},#{usertypename},#{viewable}"
			+ ",#{commentable},#{postable},#{deleteable},#{userable})")
	public boolean Save(UserType usertype);
	
	
	
	@Delete("DELETE FROM tblusertype WHERE userid=#{id}")
	public boolean delete(int id);
	
	
	@Update("UPDATE tblusertype SET usertypename=#{usertypename},"
			+ "viewable=#{viewable},commentable=#{commentable},"
			+ "postable=#{postable},deleteable=#{deleteable},userable=#{userable}")
	public boolean updateUserType(UserType usertype);
}
