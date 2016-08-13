package org.khmeracademy.v3.services.user;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.user.StudiedCourse;

public interface StudiedCourseService {
	
	ArrayList<StudiedCourse> findByUserId(int userid);
}
