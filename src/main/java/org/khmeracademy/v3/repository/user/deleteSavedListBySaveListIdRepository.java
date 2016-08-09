package org.khmeracademy.v3.repository.user;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface deleteSavedListBySaveListIdRepository {

	@Delete("DELETE FROM ka_savedlist WHERE savedlistid=#{id}")
	public boolean deletesavedlistid(@Param("id")int id);

}
