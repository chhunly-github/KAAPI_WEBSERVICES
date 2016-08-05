package org.khmeracademy.v3.services.user;

import java.util.ArrayList;


import org.khmeracademy.v3.entities.user.UserType;


public interface UserTypeService {
	UserType findByid(int id);
	/**
	 * 
	 * @return
	 */
	 UserType findByUserId( int id);
	/**
	 * 
	 * @return
	 */
	ArrayList<UserType> findAllUserType();
	/**
	 * 
	 * @param user
	 * @return
	 */
	boolean Save(UserType usertype);
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
	boolean updateUserType(UserType usertype);
}
