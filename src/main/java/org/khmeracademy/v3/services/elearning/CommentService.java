package org.khmeracademy.v3.services.elearning;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Comment;

public interface CommentService {
	
	ArrayList<Comment> findAllComment();
	
	ArrayList<Comment> findCommentbyVideoID(int id);
	
	ArrayList<Comment> findCommentbyUserID(int id);
	
	boolean saveComment(Comment comment);
	
	boolean delete(int id);
	
	boolean updateComment(String commenttext, int commentid);

	
	
}
