package org.khmeracademy.v3.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.khmeracademy.v3.entities.elearning.Video;
import org.springframework.stereotype.Repository;


@Repository
public interface findVideoByPlayListIdRepository {

		@Select("SELECT  description ,fileurl ,playlistid ,"
				+ "postdate , publicview ,status,userid , "
				+ "videoid ,videoname ,viewcount ,youtubeurl"
				+ "FROM ka_video WHERE playlistid =#{id} ")
		public ArrayList<Video> findAllVideoByPlayListId(@Param("playlistID") int id);
}
