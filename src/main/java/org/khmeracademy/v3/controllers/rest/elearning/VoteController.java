package org.khmeracademy.v3.controllers.rest.elearning;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Vote;
import org.khmeracademy.v3.services.elearning.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/elearning/vote")
public class VoteController {
	
	@Autowired
	private VoteService voteSerice;
	
	@RequestMapping(value="/byuserid{uid}" ,method=RequestMethod.GET)
	public ArrayList<Vote> findVoteByUserId(@PathVariable("uid") int uid){
		return voteSerice.findVoteByUserId(uid);
	}
	@RequestMapping(value="/byvideoid{vid}" ,method=RequestMethod.GET)
	public ArrayList<Vote> findVoteByVideoId(@PathVariable("vid") int vid){
		return voteSerice.findVoteByVideoId(vid);
	}
}
