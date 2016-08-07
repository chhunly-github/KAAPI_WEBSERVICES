package org.khmeracademy.v3.repository.elearning;

import org.apache.ibatis.annotations.Select;
import org.khmeracademy.v3.entities.elearning.PlaylistDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface playlistdetailRepository {

	@Select("SELECT tblplaylistdetail.videoid ,tblplaylistdetail.playlistid ,"
			+ "tblplaylistdetail.index FROM tblplaylist INNER JOIN tblplaylistdetail"
					+ "ON tblplaylistdetail.playlistid = tblplaylist.playlistid")
	public PlaylistDetail getByplaylistId(int id);
}
