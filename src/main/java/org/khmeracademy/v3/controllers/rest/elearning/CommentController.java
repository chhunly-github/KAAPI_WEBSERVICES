package org.khmeracademy.v3.controllers.rest.elearning;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Comment;
import org.khmeracademy.v3.services.impl.CommentServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/elearning")
public class CommentController {
	
	/*@Autowired
	private CommentServiceImplement cmt;*/
	
	@RequestMapping(value={"/comment"}, method=RequestMethod.GET)
	ArrayList<Comment> findAllComment(){
		return null;//cmt.findAllComment();
	};
	
/*	@RequestMapping(value={"/comment/{vid}"}, method=RequestMethod.GET)
	ArrayList<Comment> findCommentbyVideoID(int vid){
		return cmt.findCommentbyVideoID(vid);
	};*/
	
	
/*	@RequestMapping(value={"/comment/{uid}"}, method=RequestMethod.GET)
	ArrayList<Comment> findCommentbyUserID(int uid){
		return cmt.findCommentbyUserID(uid);
	};
	*/
	@RequestMapping(value={"/comment"}, method=RequestMethod.POST)
	boolean saveComment(@RequestBody Comment comment){
		return false;//cmt.saveComment(comment);
	};
	
	@RequestMapping(value={"/comment"}, method=RequestMethod.DELETE)
	boolean delete(int id){
		return false;//cmt.delete(id);
	};
	
	@RequestMapping(value={"/comment"}, method=RequestMethod.PUT)
	boolean updateComment(String commenttext, int commentid){
		return false;//cmt.updateComment(commenttext, commentid);
	};

	
	
		
}
