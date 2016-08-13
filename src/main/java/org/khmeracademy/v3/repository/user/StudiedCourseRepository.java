package org.khmeracademy.v3.repository.user;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.khmeracademy.v3.entities.user.StudiedCourse;
import org.springframework.stereotype.Repository;

@Repository
public interface StudiedCourseRepository {
	
	@Select("SELECT "
			+ "userid, " 
			+ "playlistid, " 
			+ "startdate, "
			+ "WHERE userid=#{userid} ")
	ArrayList<StudiedCourse> findByUserId(@Param("userid") int userid);
}
