package org.khmeracademy.v3.repository.elearning;

import org.apache.ibatis.annotations.Select;
import org.khmeracademy.v3.entities.elearning.PlaylistDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface playlistdetailRepository {

	@Select("SELECT "
			+ "pld.videoid, "
			+ "pld.playlistid ,"
			+ "pld.index "
			+ "FROM ka_playlist pl "
			+ "INNER JOIN ka_playlistdetail pld"
			+ "ON pld.playlistid = pl.playlistid")
	public PlaylistDetail getByplaylistId(int id);
}
