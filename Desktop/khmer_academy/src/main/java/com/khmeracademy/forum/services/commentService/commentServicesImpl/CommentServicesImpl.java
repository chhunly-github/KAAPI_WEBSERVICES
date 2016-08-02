package com.khmeracademy.forum.services.commentService.commentServicesImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khmeracademy.forum.entities.Comment;
import com.khmeracademy.forum.entities.User;
import com.khmeracademy.forum.repositories.commentRepository.CommentRepository;
import com.khmeracademy.forum.services.commentService.CommentService;

@Service
public class CommentServicesImpl implements CommentService{

	@Autowired CommentRepository com;
	@Override
	public ArrayList<Comment> getAllComment() {
		// TODO Auto-generated method stub
		return com.getAllComment();
	}

	@Override
	public User getComment(int comment_id) {
		return com.getComment(comment_id);
	}

	@Override
	public boolean createComment(Comment comment) {
		return com.createComment(comment);
	}

	@Override
	public boolean updateComment(Comment comment) {
		// TODO Auto-generated method stub
		return com.updateComment(comment);
	}

	@Override
	public boolean removeComment(int comment_id) {
		return com.removeComment(comment_id);
	}
	
}
