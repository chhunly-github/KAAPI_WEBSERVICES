package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.user.User;
import org.khmeracademy.v3.repository.user.UserRepository;
import org.khmeracademy.v3.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public boolean findByid(int id) {
		return userRepository.findByid(id);
	}

	@Override
	public User findByUserNameAndPassword(String username, String password) {
		return userRepository.findByUserNameAndPassword(username, password);	
		}

	@Override
	public ArrayList<User> findAllUser() {
			return userRepository.findAllUser();
	}

	@Override
	public User Save(User user) {
		return userRepository.insert(user);
	}

	@Override
	public boolean delete(int id) {
		return userRepository.delete(id);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.updateUser(user);
	}
	
}
