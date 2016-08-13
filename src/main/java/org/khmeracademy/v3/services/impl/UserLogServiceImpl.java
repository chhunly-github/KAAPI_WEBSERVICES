package org.khmeracademy.v3.services.impl;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.user.Log;
import org.khmeracademy.v3.repository.user.UserLogRepository;
import org.khmeracademy.v3.services.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLogServiceImpl implements UserLogService{

	@Autowired
	private UserLogRepository userLogRepository;
	@Override
	public ArrayList<Log> findAllUserLog(int userid) {
		// TODO Auto-generated method stub
		return userLogRepository.findAllUserLogId(userid);
	}

}
