package org.khmeracademy.v3.repository.elearning;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.v3.entities.elearning.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository {

	@Select("SELECT commentid, commentdate, commenttext, videoid, userid, replycomid"
			+ " FROM ka_videocomment")
	public ArrayList<Comment> findAllComment();
	
	@Select("SELECT commentid, commentdate, commenttext, userid, replycomid"
			+ "FROM ka_videocomment WHERE videoid = #{videoid}")
	public ArrayList<Comment> findCommentbyVideoID(int id);
	
	@Select("SELECT commentid, commentdate, commenttext, videoid, replycomid"
			+ "FROM ka_videocomment WHERE userid = #{userid}")
	public ArrayList<Comment> findCommentbyUserID(int id);	
	
	
	
	@Insert("INSERT INTO ka_videocomment(commenttext, videoid, userid, replycomid)"
			+ " VALUES = (#{commenttext}, #{videoid}, #{userid}, #{replycomid}")
	public boolean saveComment(@Param("comment")Comment comment);
	
	
	@Delete("DELETE FROM ka_videocomment WHERE commentid=#{id}")
	public boolean delete(@Param("id")int id);

	@Update("UPDATE ka_videocomment SET commenttext = #{commenttext} WHERE commentid = #{commentid}")
	public boolean updateComment(@Param("commenttext")String commenttext, @Param("commentid")int commentid);
	
	
	
}
