package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Video;
import org.khmeracademy.v3.repository.findVideoByPlayListIdRepository;
import org.khmeracademy.v3.services.elearning.findVideoByPlaylistId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class findAllVideoByPlaylistidImpl implements findVideoByPlaylistId {

	@Autowired
	private findVideoByPlayListIdRepository findVideoByPlayListid;
	@Override
	public ArrayList<Video> findAllVideoByPlayListId(int playlistId) {
		return findVideoByPlayListid.findAllVideoByPlayListId(playlistId);
	}

}
