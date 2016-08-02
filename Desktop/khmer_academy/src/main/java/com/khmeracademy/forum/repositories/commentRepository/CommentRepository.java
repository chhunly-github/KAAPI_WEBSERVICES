package com.khmeracademy.forum.repositories.commentRepository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.khmeracademy.forum.entities.Comment;
import com.khmeracademy.forum.entities.User;

public interface CommentRepository {

	/*
	 * C_MAINCATEGORY create
	 *  read 
	 * U_MAINCATEGORY update
	 * D_MAINCATEGORY delete
	 */
	
	String C_comment="INSERT INTO tb_comment(comment_id,comment_text,post_id,user_id,parent_id,comment_date_create,comment_active)"
					+ " VALUES(#{comment_id},#{comment_text},#{post_id},#{user_id},#{parent_id}"
					+ ",#{comment_date_create},#{comment_active})";
	
	String rs_comment ="SELECT * FROM tb_comment";
	
	String R_comment ="SELECT * FROM tb_comment WHERE comment_id=#{comment_id}";
	
	String U_comment="UPDATE tb_comment SET "
					+ "comment=#{comment_text},post_id=#{post_id},user_id=#{user_id},"
					+ "parent_id=#{parent_id},comment_date_create=#{comment_date_create},comment_active=#{comment_active}"
					+ " WHERE comment_id=#{comment_id}";
	
	String D_comment ="DELETE FROM tb_comment WHERE comment_id=#{comment_id}";
	
	
	@Select(rs_comment)
	public ArrayList<Comment> getAllComment();
	
	@Select(R_comment)
	public User getComment(@Param("comment_id") int comment_id);
	
	@Insert(C_comment)
	public boolean createComment(Comment comment);
	
	@Update(U_comment)
	public boolean updateComment(Comment comment);
	
	@Delete(D_comment)
	public boolean removeComment(@Param("comment_id") int comment_id);
}
