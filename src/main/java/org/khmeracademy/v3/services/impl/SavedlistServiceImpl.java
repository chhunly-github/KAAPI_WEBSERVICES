package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.SavedList;
import org.khmeracademy.v3.repository.user.SavedlistServiceRepository;
import org.khmeracademy.v3.services.user.SavedListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavedlistServiceImpl implements SavedListService {

	@Autowired
	private SavedlistServiceRepository savedlistRep;

	@Override
	public boolean deleteSavedList(int savelistid) {
		return savedlistRep.deletesavedlistid(savelistid);
	}

	@Override
	public ArrayList<SavedList> findAllByUserId(int userid) {
		// TODO Auto-generated method stub
		return savedlistRep.findAllByUserId(userid);
	}

}
