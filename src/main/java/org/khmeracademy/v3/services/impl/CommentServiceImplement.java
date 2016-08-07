package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Comment;
import org.khmeracademy.v3.repository.elearning.CommentRepository;
import org.khmeracademy.v3.services.elearning.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImplement implements CommentService{

	@Autowired
	private CommentRepository comment;
	
	@Override
	public ArrayList<Comment> findAllComment() {
		return comment.findAllComment();
	}

	@Override
	public ArrayList<Comment> findCommentbyVideoID(int id) {
		return comment.findCommentbyVideoID(id);
	}

	@Override
	public ArrayList<Comment> findCommentbyUserID(int id) {
		return comment.findCommentbyUserID(id);
	}

	@Override
	public boolean saveComment(Comment comment) {
		return this.comment.saveComment(comment);
	}

	@Override
	public boolean delete(int id) {
		return comment.delete(id);
	}

	@Override
	public boolean updateComment(String commenttext, int commentid) {
		return comment.updateComment(commenttext, commentid);
	}

}
