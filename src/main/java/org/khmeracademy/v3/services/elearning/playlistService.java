package org.khmeracademy.v3.services.elearning;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Playlist;

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

	
}
