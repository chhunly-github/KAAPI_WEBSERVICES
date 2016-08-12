package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;


import org.khmeracademy.v3.entities.user.UserType;
import org.khmeracademy.v3.repository.user.UserTypeRepository;
import org.khmeracademy.v3.services.user.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTypeImpl implements UserTypeService{
	
	@Autowired
	private UserTypeRepository usertypeRepository;

	@Override
	public UserType findByUserTypeId(int usertypeid) {
		return usertypeRepository.findByUserTypeid(usertypeid);
	}

	@Override
	public UserType findByUserId(int userid) {
		return usertypeRepository.findByUserId(userid);
	}

	@Override
	public ArrayList<UserType> findAllUserType() {
		return usertypeRepository.findAllUserType();
	}

	@Override
	public boolean Save(UserType usertype) {
		return usertypeRepository.Save(usertype);
	}

	@Override
	public boolean delete(int usertypeid) {
		return usertypeRepository.delete(usertypeid);
	}

	@Override
	public boolean updateUserType(UserType usertype) {
		return usertypeRepository.updateUserType(usertype);
	}
	
	
	

}
