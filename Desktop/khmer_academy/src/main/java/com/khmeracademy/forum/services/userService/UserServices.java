package com.khmeracademy.forum.services.userService;

import java.util.ArrayList;

import com.khmeracademy.forum.entities.User;

public interface UserServices {
	public ArrayList<User> getAllUser();
	public User getUser(int id);
	public boolean createUser(User user);
	public boolean updateUser(User user);
	public boolean removeUser(int user_id);
}
