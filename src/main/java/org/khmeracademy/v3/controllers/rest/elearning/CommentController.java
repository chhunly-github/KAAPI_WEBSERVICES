package org.khmeracademy.v3.controllers.rest.elearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.v3.entities.elearning.Comment;
import org.khmeracademy.v3.services.elearning.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/elearning/comment")
public class CommentController {
	
	@Autowired
	private CommentService cmt;
	
	@RequestMapping(value={"/main/{videoId}"}, method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findMainCommentByVideoId(@PathVariable("videoId") int videoId){
		Map<String, Object> map= new HashMap<>();
		map.put("DATA", cmt.findMainCommentByVideoId(videoId));
		map.put("MESSAGE", "SUCCESSFULLY GET DATA!");
		map.put("CODE", "200");
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	};
	
	@RequestMapping(value={"/sub/{commentid}"}, method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findSubComment(@PathVariable("commentid")int commentid){
		Map<String, Object> map= new HashMap<>();
		map.put("DATA", cmt.findSubComment(commentid));
		map.put("MESSAGE", "SUCCESSFULLY GET DATA!");
		map.put("CODE", "200");
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	};
	
	@RequestMapping(value={"/{userId}"}, method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> findCommentbyUserID(@PathVariable("userId")int userId){
		Map<String, Object> map= new HashMap<>();
		map.put("DATA", cmt.findCommentbyUserID(userId));
		map.put("MESSAGE", "SUCCESSFULLY GET DATA!");
		map.put("CODE", "200");
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	};
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> saveComment(Comment comment){
		Map<String, Object> map= new HashMap<>();
		map.put("DATA", cmt.saveComment(comment));
		map.put("MESSAGE", "SUCCESSFULLY INSERTED DATA!");
		map.put("CODE", "200");
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	};
	
	@RequestMapping(value={"/{commentId}"}, method=RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> delete(@PathVariable("commentId")int commentId){
		Map<String, Object> map= new HashMap<>();
		map.put("DATA", cmt.delete(commentId));
		map.put("MESSAGE", "SUCCESSFULLY DELETED DATA!");
		map.put("CODE", "200");
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	};
	
	@RequestMapping(method=RequestMethod.PATCH)
	public ResponseEntity<Map<String, Object>> updateComment(@RequestParam String commenttext, @RequestParam int commentid){
		Map<String, Object> map= new HashMap<>();
		map.put("DATA", cmt.updateComment(commenttext, commentid));
		map.put("MESSAGE", "SUCCESSFULLY DELETED DATA!");
		map.put("CODE", "200");
		return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
	};

	
	
		
}
