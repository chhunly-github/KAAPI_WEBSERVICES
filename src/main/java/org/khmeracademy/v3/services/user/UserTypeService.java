package org.khmeracademy.v3.services.user;

import java.util.ArrayList;


import org.khmeracademy.v3.entities.user.UserType;
import org.springframework.stereotype.Service;

@Service
public interface UserTypeService {
	UserType findByUserTypeId(int usertypeid);
	/**
	 * 
	 * @return
	 */
	 UserType findByUserId( int userid);
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
