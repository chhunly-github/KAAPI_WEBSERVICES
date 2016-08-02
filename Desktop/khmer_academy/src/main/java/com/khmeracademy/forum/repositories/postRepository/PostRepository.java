package com.khmeracademy.forum.repositories.postRepository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.khmeracademy.forum.entities.Post;
import com.khmeracademy.forum.entities.User;

public interface PostRepository {
	/*
	 * C_MAINCATEGORY create
	 *  read 
	 * U_MAINCATEGORY update
	 * D_MAINCATEGORY delete
	 */
	
	String C_User="INSERT INTO tb_post (post_id,post_title,post_desc,post_date_create,cat_id,user_id,post_active)"
			+ "VALUES(#{post_id},#{post_title},#{post_desc},#{post_date_create},#{cat_id},#{user_id},#{post_active})";
	
	String rs_User ="SELECT * FROM tb_post";
	
	String R_User ="SELECT * FROM tb_post WHERE post_id=#{post_id}";
	
	String U_User="UPDATE tb_post SET "
					+ "post_title=#{post_title},post_desc=#{post_desc},post_date_create=#{post_date_create},cat_id=#{cat_id},"
					+ "user_id=#{user_id},post_active=#{post_active},register_date=#{register_date}"
					+ " WHERE post_id=#{post_id}";
	
	String D_User ="DELETE FROM tb_post WHERE post_id=#{post_id}";
	
	
	@Select(rs_User)
	public ArrayList<Post> getAllPost();
	
	@Select(R_User)
	public User getPost(@Param("post_id") int post_id);
	
	@Insert(C_User)
	public boolean createUser(Post post);
	
	@Update(U_User)
	public boolean updateUser(Post post);
	
	@Delete(D_User)
	public boolean removeUser(@Param("post_id") int post_id);
}
