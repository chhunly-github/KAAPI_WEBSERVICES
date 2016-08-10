package org.khmeracademy.v3.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;
import org.khmeracademy.v3.entities.user.Log;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLogRepository {
	@Select("SELECT * FROM ka_log WHERE userid=#{userid}")
	public ArrayList<Log> findAllUserLogId( int userid);
}
