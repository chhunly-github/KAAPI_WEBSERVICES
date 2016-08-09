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
			+ "status WHERE playlistid=#{id}")
	public Video findVideoinSavedListByPlaylistId(@Param("id")int id);
}
