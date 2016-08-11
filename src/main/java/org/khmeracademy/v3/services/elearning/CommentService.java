package org.khmeracademy.v3.services.elearning;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Comment;


public interface CommentService {
	
	ArrayList<Comment> findMainCommentByVideoId(int videoId);
	
	ArrayList<Comment> findSubComment(int commentId);
	
	ArrayList<Comment> findCommentbyUserID(int userId);
	
	boolean saveComment(Comment comment);
	
	boolean delete(int commentId);
	
	boolean updateComment(String commenttext, int commentid);

	ArrayList<Comment> findAllComment();
	
}
