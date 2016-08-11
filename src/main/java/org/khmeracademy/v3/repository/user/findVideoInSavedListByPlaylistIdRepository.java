package org.khmeracademy.v3.repository.user;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.khmeracademy.v3.entities.elearning.Video;
import org.springframework.stereotype.Repository;

@Repository
public interface findVideoInSavedListByPlaylistIdRepository {

	@Select(" SELECT videoname ,"
			+ "description ,"
			+ "youtubeurl ,"
			+ "fileurl ,"
			+ "publicview ,"
			+ "postdate ,"
			+ "userid ,"
			+ "viewcount ,"
			+ "status FROM ka_video WHERE playlistid=#{playlistid}")
	public Video findVideoinSavedListByPlaylistId(@Param("playlistid")int playlistid);
}
