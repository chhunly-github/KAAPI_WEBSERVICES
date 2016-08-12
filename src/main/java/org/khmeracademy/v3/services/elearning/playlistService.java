package org.khmeracademy.v3.services.elearning;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.khmeracademy.v3.entities.elearning.Playlist;
import org.khmeracademy.v3.entities.elearning.Video;

public interface playlistService {
	
	public Playlist getById(int id);
	/**
	 * 
	 * @return
	 */
	public ArrayList<Playlist> getAll();
	/**
	 * 
	 * @return
	 */
	public boolean deletePlaylistId(int id);

	ArrayList<Video> findAllVideoByPlaylistid(int id);
	
	public ArrayList<Playlist> findAllVideoByMainCategoryID(int catId);
}
