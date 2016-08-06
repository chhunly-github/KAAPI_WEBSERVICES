package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;


import org.khmeracademy.v3.entities.user.UserType;
import org.khmeracademy.v3.repository.UserTypeRepository;
import org.khmeracademy.v3.services.user.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserTypeImpl implements UserTypeService{
	
	@Autowired
	private UserTypeRepository usertypeRepository;
	@Override
	public UserType findByid(int id) {
		return usertypeRepository.findByid(id);
	}

	@Override
	public UserType findByUserId(int id) {
		return usertypeRepository.findByUserId(id);
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
	public boolean delete(int id) {
		return usertypeRepository.delete(id);
	}

	@Override
	public boolean updateUserType(UserType usertype) {
		return usertypeRepository.updateUserType(usertype);
	}

	
	

}
