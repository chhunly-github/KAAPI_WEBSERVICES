package org.khmeracademy.v3.services.elearning;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Vote;
import org.springframework.stereotype.Service;

@Service
public interface VoteService {

	ArrayList<Vote> findVoteByUserId(int uid);
	ArrayList<Vote> findVoteByVideoId(int vid);
	boolean saveVoteVideo(Vote vote);
	int countVoteByVideoId(int vid);
	int countVoteByUserId(int uid);
}
