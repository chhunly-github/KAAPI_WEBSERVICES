package org.khmeracademy.v3.services.impl;

import org.khmeracademy.v3.entities.elearning.Playlist;
import org.khmeracademy.v3.repository.user.UserPlayListRepository;
import org.khmeracademy.v3.services.user.UserPlayListService;
import org.springframework.stereotype.Service;
@Service
public class UserPlayListServiceImpl implements UserPlayListService{

	private UserPlayListRepository userplaylistrepository;
	@Override
	public Playlist findPlaylistByUserId(int userid) {
		// TODO Auto-generated method stub
		return userplaylistrepository.findPlaylistByUserId(userid);
	}

}
