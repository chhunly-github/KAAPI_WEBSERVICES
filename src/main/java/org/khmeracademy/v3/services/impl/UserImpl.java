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
	public boolean Save(User user) {
		return userRepository.insert(user);
	}

	@Override
	public boolean deleteByAdmin(int id) {
		return userRepository.deleteByAdmin(id);
	}

	@Override
	public boolean updateUserInfoById(User user) {
		return userRepository.updateUserInfoById(user);
	}

	@Override
	public User findByUserId(int userid) {
		return userRepository.findByUserId(userid);
	}

	@Override
	public boolean updateUserPassword(String username, String newpassword, String oldpassword) {
		
		return userRepository.updateUserPassword(username, newpassword, oldpassword);
	}

	@Override
	public boolean updateUserProfilePicture(String path, String username) {
		return userRepository.updateUserProfilePicture(path, username);
	}

	@Override
	public boolean updateUserInfoByUsernameAndPassword(User user) {
		return userRepository.updateUserInfoByUsernameAndPassword(user);
	}

	@Override
	public boolean updatePointByUsername(int point, String username) {
		return userRepository.updateUserPointByUsername(point, username);
	}
	
}
