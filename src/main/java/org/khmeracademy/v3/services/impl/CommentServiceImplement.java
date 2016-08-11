package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImplement implements org.khmeracademy.v3.services.elearning.CommentService{

	@Autowired
	private org.khmeracademy.v3.repository.elearning.CommentRepository comment;
	
	@Override
	public ArrayList<Comment> findMainCommentByVideoId(int videoId) {
		return comment.findMainCommentByVideoId(videoId);
	}
	
	@Override
	public ArrayList<Comment> findSubComment(int commentid) {
	
		return comment.findSubComment(commentid);
	}

	@Override
	public ArrayList<Comment> findCommentbyUserID(int userId) {
		return comment.findCommentbyUserID(userId);
	}
	
	@Override
	public boolean saveComment(Comment comment) {
		return this.comment.saveComment(comment);
	}

	@Override
	public boolean delete(int commentId) {
		return comment.delete(commentId);
	}

	@Override
	public boolean updateComment(String commenttext, int commentid) {
		return comment.updateComment(commenttext, commentid);
	}

	@Override
	public ArrayList<Comment> findAllComment() {

		return comment.findAllComment();
	}

}
