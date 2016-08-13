package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.user.StudiedCourse;
import org.khmeracademy.v3.repository.user.StudiedCourseRepository;
import org.khmeracademy.v3.services.user.StudiedCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudiedCourseServiceImpl implements StudiedCourseService{
	@Autowired
	private StudiedCourseRepository courseRepository;

	@Override
	public ArrayList<StudiedCourse> findByUserId(int userid) {
		return courseRepository.findByUserId(userid);
	}
	
	
}
