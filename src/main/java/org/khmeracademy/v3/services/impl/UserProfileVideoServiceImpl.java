package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.Video;
import org.khmeracademy.v3.repository.user.UserProfileWatchVideoRepository;
import org.khmeracademy.v3.services.user.UserProfileVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileVideoServiceImpl implements UserProfileVideoService {

	@Autowired
	private UserProfileWatchVideoRepository userprofilevideo;
	
	@Override
	public ArrayList<Video> findWatchedVideoByUserId(int userid) {

		return userprofilevideo.findWatchedVideoByUserId(userid);
	}

}
