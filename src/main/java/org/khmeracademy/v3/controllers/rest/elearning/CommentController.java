package org.khmeracademy.v3.controllers.rest.elearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.khmeracademy.v3.entities.elearning.Comment;
import org.khmeracademy.v3.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/elearning/comment")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping(value={"/all"}, method=RequestMethod.GET)
	ArrayList<Comment> findAllComment(){
		return commentService.findAllComment();
	};
	
/*	@RequestMapping(value={"/comment/{vid}"}, method=RequestMethod.GET)
	ArrayList<Comment> findCommentbyVideoID(int vid){
		return cmt.findCommentbyVideoID(vid);
	};*/
	
	
	@RequestMapping(value={"/user/{uid}"}, method=RequestMethod.GET)
	ResponseEntity<Map<String, Object>> findCommentbyUserID(@PathVariable("uid") int uid){
		Map<String, Object> map=new HashMap<>();
		map.put("DATA", commentService.findCommentbyUserID(uid));
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	@RequestMapping(method=RequestMethod.POST)
	boolean saveComment(@RequestBody Comment comment){
		return commentService.saveComment(comment);
	};
	
	@RequestMapping( method=RequestMethod.DELETE)
	ResponseEntity<Map<String, Object>> delete(int id){
		Map<String, Object> map=new HashMap<>();
		if(commentService.delete(id)){
			map.put("MESSAGE", "SUCCESSFULLY");
			map.put("STATUS", "200");
		}else{
			map.put("MESSAGE", "FAILED");
			map.put("STATUS", "405");
		}
		
		return new ResponseEntity<>(map, HttpStatus.OK);
	};
	
	@RequestMapping(method=RequestMethod.PUT)
	ResponseEntity<Map<String, Object>> updateComment(String commenttext, int commentid){
		Map<String, Object> map=new HashMap<>();
		if(commentService.updateComment(commenttext, commentid)){
			map.put("MESSAGE", "SUCCESSFULLY");
			map.put("STATUS", "200");
		}else{
			map.put("MESSAGE", "FAILED");
			map.put("STATUS", "405");
		}
		
		return new ResponseEntity<>(map, HttpStatus.OK);
	};

	
	
		
}
