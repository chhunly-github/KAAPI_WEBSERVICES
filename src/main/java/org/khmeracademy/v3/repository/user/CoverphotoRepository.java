package org.khmeracademy.v3.repository.user;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.v3.entities.user.CoverPhoto;
import org.springframework.stereotype.Repository;

@Repository
public interface CoverphotoRepository {


	@Select("SELECT * FROM ka_coverphoto WHERE userid=#{userid}")
	public CoverPhoto findCoverPhotoByUserId(int userid);
	
	@Insert("INSERT INTO ka_coverphoto (coverid, coverphoto, userid)"
			+ " VALUES = (#{coverid}, #{coverphoto}, #{userid}")
	public boolean saveCoverPhoto(CoverPhoto coverphoto);
	
	
	@Delete("DELETE FROM ka_coverphoto WHERE coverid=#{id}")
	public boolean deleteCoverPhoto(@Param("id")int id);

	@Update("UPDATE ka_coverphoto SET  WHERE coverid = #{coverid}")
	public boolean updateCoverPhoto(@Param("coverid")int coverid);
	
	
	
	

	
}
