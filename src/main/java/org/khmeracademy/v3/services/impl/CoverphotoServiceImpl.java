package org.khmeracademy.v3.services.impl;

import org.khmeracademy.v3.entities.user.CoverPhoto;
import org.khmeracademy.v3.repository.user.CoverphotoRepository;
import org.khmeracademy.v3.services.user.CoverphotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoverphotoServiceImpl implements CoverphotoService{

	@Autowired
	private CoverphotoRepository coverphtoRepository;

	@Override
	public CoverPhoto findCoverPhotoByUserId(int uid) {
		// TODO Auto-generated method stub
		return coverphtoRepository.findCoverPhotoByUserId(uid);
	}

	@Override
	public boolean saveCoverPhoto(CoverPhoto coverphoto) {
		// TODO Auto-generated method stub
		return this.coverphtoRepository.saveCoverPhoto(coverphoto);
	}

	@Override
	public boolean deleteCoverPhoto(int uid) {
		// TODO Auto-generated method stub
		return coverphtoRepository.deleteCoverPhoto(uid);
	}

	@Override
	public boolean updateCoverPhoto(int uid) {
		// TODO Auto-generated method stub
		return coverphtoRepository.updateCoverPhoto(uid);
	}

	
	



}
