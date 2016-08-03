package org.khmeracademy.v3.services.user;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.user.User;
import org.springframework.stereotype.Service;

public interface UserService {

	boolean findByid(int id);
	/**
	 * 
	 * @return
	 */
	 User findByUserNameAndPassword( String username,String password);
	/**
	 * 
	 * @return
	 */
	ArrayList<User> findAllUser();
	/**
	 * 
	 * @param user
	 * @return
	 */
	User Save(User user);
	/**
	 * 
	 * @param id
	 * @return
	 */
	boolean delete(int id);
	/**
	 * 
	 * @param user
	 * @return
	 */
	User updateUser(User user);
	
	
}
