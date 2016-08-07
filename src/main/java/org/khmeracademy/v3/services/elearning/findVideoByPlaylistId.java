package org.khmeracademy.v3.services.elearning;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Video;

public interface findVideoByPlaylistId {
	/**
	 * 
	 * @return
	 */
	public ArrayList<Video> findAllVideoByPlayListId(int playlistId);
}
