package org.khmeracademy.v3.repository.user;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;
import org.khmeracademy.v3.entities.elearning.Video;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileWatchVideoRepository {

	@Select("SELECT * FROM ka_video "
			+ "INNER JOIN ka_log ON ka_log.videoid = ka_video.videoid WHERE ka_log.userid = #{userid}")
	ArrayList<Video> findWatchedVideoByUserId(int userid);
	
	
}
