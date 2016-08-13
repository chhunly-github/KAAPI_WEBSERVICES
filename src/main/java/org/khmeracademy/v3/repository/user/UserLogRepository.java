package org.khmeracademy.v3.repository.user;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;
import org.khmeracademy.v3.entities.user.Log;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLogRepository {
	@Select("SELECT l.logid, "
			+ "l.videoid, "
			+ "v.videoname, "
			+ "v.youtubeurl, "
			+ "l.starttime, "
			+ "l.stoptime "
			+ "FROM ka_log l INNER JOIN ka_video v ON v.videoid=l.videoid "
			+ "WHERE l.userid=#{userid}")
	public ArrayList<Log> findAllUserLogId( int userid);
}
	