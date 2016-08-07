package org.khmeracademy.v3.services.user;

import org.khmeracademy.v3.entities.user.CoverPhoto;
import org.springframework.stereotype.Service;

@Service
public interface CoverphotoService {

	CoverPhoto findCoverPhotoByUserId(int uid);
	
	boolean saveCoverPhoto(CoverPhoto coverphoto);
	boolean deleteCoverPhoto(int uid);
	boolean updateCoverPhoto(int uid);
}
