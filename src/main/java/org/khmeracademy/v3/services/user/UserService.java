package org.khmeracademy.v3.services.user;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.user.User;


public interface UserService {

	/**
	 * 
	 * @return
	 */
	 User findByUserNameAndPassword(String username,String password);
	 /**
	  * 
	  * @param userid
	  * @return
	  */
	 User findByUserId(int userid);
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
	boolean Save(User user);
	/**
	 * 
	 * @param id
	 * @return
	 */
	boolean deleteByAdmin(int id);
	/**
	 * 
	 * @param user
	 * @return
	 */
	
	boolean updateUserInfoById(User user);
	boolean updateUserProfilePicture(String path, String username);
	boolean updateUserInfoByUsernameAndPassword(User user);
	boolean updateUserPassword(String username, String newpassword, String oldpassword);
	boolean updatePointByUsername(int point, String username);
}
