package org.khmeracademy.v3.repository.user;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.khmeracademy.v3.entities.elearning.SavedList;
import org.springframework.stereotype.Repository;

@Repository
public interface SavedlistServiceRepository {

	@Delete("DELETE FROM ka_savedlist WHERE savedlistid=#{savedlistid}")
	public boolean deletesavedlistid(@Param("savedlistid") int savedlistid);
	
	@Select("SELECT "
			+ "savedlistid, "
			+ "playlistid, "
			+ "videoid, "
			+ "savedlistname, "
			+ "thumbnail, "
			+ "createddate "
			+ "FROM ka_savedlist "
			+ "WHERE userid=#{userid}")
	ArrayList<SavedList> findAllByUserId(@Param("userid") int userid);
}
