package org.khmeracademy.v3.services.user;

import org.khmeracademy.v3.entities.elearning.Playlist;

public interface UserPlayListService {

	Playlist findPlaylistByUserId(int userid);
}
