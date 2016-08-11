package org.khmeracademy.v3.repository.user;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SavedlistServiceRepository {

	@Delete("DELETE FROM ka_savedlist WHERE savedlistid=#{savedlistid}")
	public boolean deletesavedlistid(@Param("savedlistid") int savedlistid);

}
