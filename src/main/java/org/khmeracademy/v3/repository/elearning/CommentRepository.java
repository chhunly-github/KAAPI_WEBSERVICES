package org.khmeracademy.v3.repository.elearning;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.v3.entities.elearning.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository {

	@Select("SELECT com.commentid, com.commentdate, com.commenttext, com.videoid, com.userid, vid.videoname, usr.username, usr.userimageurl, com.replycomid "
			+ "FROM ka_videocomment com "
			+ "INNER JOIN ka_video vid on com.videoid = vid.videoid "
			+ "INNER JOIN ka_user usr on com.userid = usr.userid "
			+ "WHERE com.videoid = #{videoId} AND (com.replycomid = 0 OR com.replycomid ISNULL) "
			+ "ORDER BY com.commentdate")
	@Results({
		@Result(property="commentId", column="commentid"),
		@Result(property="commentDate", column="commentdate"),
		@Result(property="commentText", column="commenttext"),
		@Result(property="videoId", column="videoid"),
		@Result(property="userId", column="userid"),
		@Result(property="videoName", column="videoname"),
		@Result(property="username", column="username"),
		@Result(property="userImageUrl", column="userimageurl"),
		@Result(property="replyId", column="replycomid")
	})
	public ArrayList<Comment> findMainCommentByVideoId(int videoId);
	
	
	@Select("SELECT com.commentid, com.commentdate, com.commenttext, com.videoid, com.userid, vid.videoname, usr.username, usr.userimageurl, com.replycomid "
			+ "FROM ka_videocomment com "
			+ "INNER JOIN ka_video vid on com.videoid = vid.videoid "
			+ "INNER JOIN ka_user usr on com.userid = usr.userid "
			+ "ORDER BY com.commentdate")
	@Results({
		@Result(property="commentId", column="commentid"),
		@Result(property="commentDate", column="commentdate"),
		@Result(property="commentText", column="commenttext"),
		@Result(property="videoId", column="videoid"),
		@Result(property="userId", column="userid"),
		@Result(property="videoName", column="videoname"),
		@Result(property="username", column="username"),
		@Result(property="userImageUrl", column="userimageurl"),
		@Result(property="replyId", column="replycomid")
	})
	public ArrayList<Comment> findAllComment();
	
	
	@Select("SELECT com.commentid, com.commentdate, com.commenttext, com.videoid, com.userid, vid.videoname, usr.username, usr.userimageurl, com.replycomid "
			+ "FROM ka_videocomment com "
			+ "INNER JOIN ka_video vid on com.videoid = vid.videoid "
			+ "INNER JOIN ka_user usr on com.userid = usr.userid "
			+ "WHERE com.userid = #{userId} "
			+ "ORDER BY com.videoid, com.commentdate")
	@Results({
		@Result(property="commentId", column="commentid"),
		@Result(property="commentDate", column="commentdate"),
		@Result(property="commentText", column="commenttext"),
		@Result(property="videoId", column="videoid"),
		@Result(property="userId", column="userid"),
		@Result(property="videoName", column="videoname"),
		@Result(property="username", column="username"),
		@Result(property="userImageUrl", column="userimageurl"),
		@Result(property="replyId", column="replycomid")
	})
	public ArrayList<Comment> findCommentbyUserID(int userId);	
	
	
	@Select("SELECT com.commentid, com.commentdate, com.commenttext, com.videoid, com.userid, vid.videoname, usr.username, usr.userimageurl, com.replycomid "
			+ "FROM ka_videocomment com "
			+ "INNER JOIN ka_video vid on com.videoid = vid.videoid "
			+ "INNER JOIN ka_user usr on com.userid = usr.userid "
			+ "INNER JOIN ka_videocomment com2 ON com.commentid = com2.commentid "
			+ "WHERE com2.replycomid = #{commentid} "
			+ "ORDER BY com.videoid, com.commentdate")
	@Results({
		@Result(property="commentId", column="commentid"),
		@Result(property="commentDate", column="commentdate"),
		@Result(property="commentText", column="commenttext"),
		@Result(property="videoId", column="videoid"),
		@Result(property="userId", column="userid"),
		@Result(property="videoName", column="videoname"),
		@Result(property="username", column="username"),
		@Result(property="userImageUrl", column="userimageurl"),
		@Result(property="replyId", column="replycomid")
	})
	public ArrayList<Comment> findSubComment(int commentid);	
	
	
	@Insert("INSERT INTO ka_videocomment(commenttext, videoid, userid, replycomid) "
			+ "VALUES(#{commentText}, #{videoId}, #{userId}, #{replyId})")
	public boolean saveComment(Comment comment);
	
	
	@Delete("DELETE FROM ka_videocomment WHERE commentid=#{commentId}")
	public boolean delete(int commentId);

	
	@Update("UPDATE ka_videocomment SET commenttext = #{commenttext} WHERE commentid = #{commentid}")
	public boolean updateComment(String commenttext, int commentid);
	
	
	
}
