package org.khmeracademy.v3.services.elearning;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Playlist;
import org.khmeracademy.v3.entities.elearning.Video;
import org.khmeracademy.v3.repository.elearning.playlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class playlistServiceImpl implements playlistService {

	@Autowired
	private playlistRepository playlistRepoitory;

	@Override
	public Playlist getById(int id) {
		return playlistRepoitory.getById(id);
	}

	@Override
	public ArrayList<Playlist> getAll() {
		return playlistRepoitory.getAll();
	}

	@Override
	public boolean deletePlaylistId(int id) {
		return playlistRepoitory.delete(id);
	}

	@Override
	public ArrayList<Video> findAllVideoByPlaylistid(int id) {
		// TODO Auto-generated method stub
		return playlistRepoitory.findAllVideoByPlayListId(id);
	}

}
