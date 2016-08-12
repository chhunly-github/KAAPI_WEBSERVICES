package org.khmeracademy.v3.services.user;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.user.University;


public interface UniversityService {
	public ArrayList<University>listUniversity();
	public ArrayList<University>FindByUserID(int id);
	public University AddNew(University university);
	public boolean Delete(int id);
	public boolean Update(int id);
	
}
