package org.khmeracademy.v3.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.khmeracademy.v3.entities.elearning.Playlist;
import org.springframework.stereotype.Repository;

@Repository
public interface playlistRepository {

	@Select("SELECT * FROM tblplaylist WHERE playlistid=#{id}")
	public Playlist getById(int id);
	
	
	@Select("SELECT * FROM tblplaylist")
	public ArrayList<Playlist> getAll();
	
	@Delete("DELETE FROM tblplaylist WHERE playlistid=#{id}")
	public boolean delete(int id);
	
}
