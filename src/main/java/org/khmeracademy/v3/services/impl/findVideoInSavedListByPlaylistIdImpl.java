package org.khmeracademy.v3.services.impl;

import org.khmeracademy.v3.entities.elearning.Video;
import org.khmeracademy.v3.repository.user.findVideoInSavedListByPlaylistIdRepository;
import org.khmeracademy.v3.services.user.findVideoInSavedListByPlaylistId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class findVideoInSavedListByPlaylistIdImpl implements findVideoInSavedListByPlaylistId {

	@Autowired
	private findVideoInSavedListByPlaylistIdRepository findVideoById;
	
	@Override
	public Video findVideoinSavedListByPlaylistId(int playlistid) {
		return findVideoById.findVideoinSavedListByPlaylistId(playlistid);
	}

}
