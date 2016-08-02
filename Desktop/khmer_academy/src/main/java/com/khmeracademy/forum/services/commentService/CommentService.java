package com.khmeracademy.forum.services.commentService;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.khmeracademy.forum.entities.Comment;
import com.khmeracademy.forum.entities.User;

public interface CommentService {
	
	public ArrayList<Comment> getAllComment();
	public User getComment(int comment_id);
	public boolean createComment(Comment comment);
	public boolean updateComment(Comment comment);
	public boolean removeComment(int comment_id);
	
}
