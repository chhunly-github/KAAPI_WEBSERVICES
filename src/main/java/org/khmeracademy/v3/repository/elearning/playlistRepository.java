package org.khmeracademy.v3.repository.elearning;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.khmeracademy.v3.entities.elearning.Playlist;
import org.khmeracademy.v3.entities.elearning.Video;
import org.springframework.stereotype.Repository;

@Repository
public interface playlistRepository {

	@Select("SELECT * FROM ka_playlist WHERE playlistid=#{id}")
	@Results(value={
			@Result(property="playlistid", column="playlistid"),
			@Result(property="videos" , column="playlistid" , 
					many = @Many(select = "findAllVideoByPlayListId")),
	})
	public Playlist getById(int id);
	
	
	@Select("SELECT * FROM ka_playlist")
	public ArrayList<Playlist> getAll();
	
	@Delete("DELETE FROM ka_playlist WHERE playlistid=#{id}")
	public boolean delete(int id);
	
	@Select("SELECT description ,fileurl ,playlistid ,"
			+ "postdate, "
			+ "publicview, "
			+ "userid , "
			+ "videoid, "
			+ "videoname, "
			+ "viewcount, "
			+ "youtubeurl "
			+ "FROM ka_video WHERE playlistid =#{playlistID} ")
	public ArrayList<Video> findAllVideoByPlayListId(@Param("playlistID") int id);
	
	@Select("SELECT playlistid, playlistname, description, thumbnailurl, maincategory, bgimage, duration "
			+ "FROM ka_playlist WHERE maincategory =#{catId} ")
	@Results(value={
			@Result(property="playlistid", column="playlistid"),
			@Result(property="videos" , column="playlistid" , 
					many = @Many(select = "findAllVideoByPlayListId")),
	})
	public ArrayList<Playlist> findAllVideoByMainCategoryID(@Param("catId") int catId);
}
