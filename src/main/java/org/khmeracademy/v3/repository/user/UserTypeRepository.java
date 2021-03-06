package org.khmeracademy.v3.repository.user;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.v3.entities.user.UserType;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository {

	
	@Select("SELECT * FROM ka_usertype WHERE usertypeid=#{usertypeid}")
	UserType findByUserTypeid(int usertypeid);
	
	@Select("SELECT ut.commentable ,"
			+ "ut.deleteable ,"
			+ "ut.postable ,"
			+ "ut.userable ,"
			+ "ut.usertypeid ,"
			+ "ut.usertypename ,"
			+ "ut.viewable "
			+ "FROM ka_user INNER JOIN "
			+ "ka_usertype ut ON ut.usertypeid = ka_user.usertypeid WHERE ka_user.userid=#{userid}")
	public UserType findByUserId(int userid);
	
	@Select("SELECT * FROM ka_usertype ")
	ArrayList<UserType> findAllUserType();
	
	
	
	@Insert("INSERT INTO ka_usertype(usertypeid ,"
			+ "usertypename ,"
			+ "viewable ,"
			+ "commentable ,"
			+ "postable ,"
			+ "deleteable ,"
			+ "userable)"
			+ " values(#{usertypeid},#{usertypename},#{viewable}"
			+ ",#{commentable},#{postable},#{deleteable},#{userable})")
	public boolean Save(UserType usertype);
	
	
	
	@Delete("DELETE FROM ka_usertype WHERE usertypeid=#{usertypeid}")
	public boolean delete(@Param("usertypeid")int usertypeid);
	
	
	@Update("UPDATE ka_usertype SET usertypename=#{usertypename},"
			+ "viewable=#{viewable},commentable=#{commentable},"
			+ "postable=#{postable},deleteable=#{deleteable},userable=#{userable}")
	public boolean updateUserType(UserType usertype);
}
