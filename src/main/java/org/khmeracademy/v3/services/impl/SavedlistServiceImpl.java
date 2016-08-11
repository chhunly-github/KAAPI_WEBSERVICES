package org.khmeracademy.v3.services.impl;

import org.khmeracademy.v3.repository.user.SavedlistServiceRepository;
import org.khmeracademy.v3.services.user.SavedListSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavedlistServiceImpl implements SavedListSerice {

	@Autowired
	private SavedlistServiceRepository savedlistRep;

	@Override
	public boolean deleteSavedList(int savelistid) {
		return savedlistRep.deletesavedlistid(savelistid);
	}

}
