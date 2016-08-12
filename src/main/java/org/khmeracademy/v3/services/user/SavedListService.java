package org.khmeracademy.v3.services.user;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.elearning.SavedList;

public interface SavedListService {

	public boolean deleteSavedList(int id); 
	ArrayList<SavedList> findAllByUserId( int userid);
}
