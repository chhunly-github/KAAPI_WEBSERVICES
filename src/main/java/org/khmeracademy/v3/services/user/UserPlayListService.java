package org.khmeracademy.v3.services.user;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Playlist;

public interface UserPlayListService {

	ArrayList<Playlist> findPlaylistByUserId(int userid);
}
