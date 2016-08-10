package org.khmeracademy.v3.services;

import java.util.ArrayList;

import org.khmeracademy.v3.entities.user.Log;

public interface UserLogService {

	ArrayList<Log> findAllUserLog(int userid);
}
