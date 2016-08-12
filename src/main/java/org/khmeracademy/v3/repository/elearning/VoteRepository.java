package org.khmeracademy.v3.repository.elearning;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.khmeracademy.v3.entities.elearning.Vote;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository {
	
	@Select("SELECT userid, videoid, votetype FROM ka_videovote WHERE userid=#{uid}")
	public ArrayList<Vote> findVoteByUserId(@Param("uid") int uid);
	
	@Select("SELECT * FROM ka_videovote WHERE videoid=#{vid}")
	public ArrayList<Vote> findVoteByVideoId(@Param("vid") int vid);
	
	@Select("SELECT COUNT(vv.userid) FROM ka_videovote"
			+ " vv INNER JOIN ka_video v ON v.videoid = vv.videoid "
			+ "WHERE vv.videoid=#{vid};")
	public int countVoteByVideoId(@Param("vid") int vid);
	
	
	@Select("SELECT COUNT(v.videoid)"
			+ "FROM ka_videovote v "
			+ "INNER JOIN ka_user u ON u.userid=v.userid WHERE v.userid=#{uid};")
	public int countVoteByUserID(@Param("uid") int uid);
	
	
	@Insert("INSERT INTO ka_videovote(userid, videoid, votetype) "
			+ "VALUES(#{userid}, #{videoid}, #{votetype})")
	public boolean saveVoteVideo(Vote vote);
}
