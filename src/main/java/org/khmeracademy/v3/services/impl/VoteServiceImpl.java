package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Vote;
import org.khmeracademy.v3.repository.elearning.VoteRepository;
import org.khmeracademy.v3.services.elearning.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteServiceImpl implements VoteService{

	@Autowired
	private VoteRepository voteRepository;
	
	@Override
	public ArrayList<Vote> findVoteByUserId(int uid) {
		// TODO Auto-generated method stub
		return voteRepository.findVoteByUserId(uid);
	}

	@Override
	public ArrayList<Vote> findVoteByVideoId(int vid) {
		// TODO Auto-generated method stub
		return voteRepository.findVoteByVideoId(vid);
	}


	
}