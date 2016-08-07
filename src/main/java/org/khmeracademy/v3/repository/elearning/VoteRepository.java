package org.khmeracademy.v3.repository.elearning;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;
import org.khmeracademy.v3.entities.elearning.Vote;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository {
	
	@Select("SELECT userid, videoid, votetype FROM ka_videovote WHERE userid=#{uid}")
	public ArrayList<Vote> findVoteByUserId( int uid);
	
	@Select("SELECT * FROM ka_videovote WHERE videoid=#{vid}")
	public ArrayList<Vote> findVoteByVideoId( int vid);
}
