package org.khmeracademy.v3.services.user;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Video;


public interface UserProfileVideoService {

	ArrayList<Video> findWatchedVideoByUserId(int userid);
}
