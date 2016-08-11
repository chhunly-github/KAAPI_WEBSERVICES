package org.khmeracademy.v3.repository.user;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;
import org.khmeracademy.v3.entities.elearning.Playlist;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPlayListRepository {

	@Select("SELECT * FROM ka_playlist WHERE userid=#{userid}")
	public ArrayList<Playlist> findPlaylistByUserId(int userid);
}
