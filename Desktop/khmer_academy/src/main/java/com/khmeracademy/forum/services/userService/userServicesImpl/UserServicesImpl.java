package com.khmeracademy.forum.services.userService.userServicesImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khmeracademy.forum.entities.User;
import com.khmeracademy.forum.repositories.userRepository.UserRepository;
import com.khmeracademy.forum.services.userService.UserServices;

@Service
public class UserServicesImpl implements UserServices {
	
	@Autowired 
	private UserRepository userRepo;
	
	@Override
	public ArrayList<User> getAllUser() {
		return userRepo.getAllUser();
	}

	@Override
	public User getUser(int id) {
		return userRepo.getUser(id);
	}

	@Override
	public boolean createUser(User user) {
		return userRepo.createUser(user);
	}

	@Override
	public boolean updateUser(User user) {
		return userRepo.updateUser(user);
	}

	@Override
	public boolean removeUser(int user_id) {
		return userRepo.removeUser(user_id);
	}

}
