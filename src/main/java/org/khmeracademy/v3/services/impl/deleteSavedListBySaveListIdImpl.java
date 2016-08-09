package org.khmeracademy.v3.services.impl;

import org.khmeracademy.v3.repository.user.deleteSavedListBySaveListIdRepository;
import org.khmeracademy.v3.services.user.deleteSavedListBySaveListId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class deleteSavedListBySaveListIdImpl implements deleteSavedListBySaveListId {

	@Autowired
	private deleteSavedListBySaveListIdRepository deleteSavedListById;

	@Override
	public boolean deleteSavedList(int id) {
		return deleteSavedListById.deletesavedlistid(id);
	}

}
