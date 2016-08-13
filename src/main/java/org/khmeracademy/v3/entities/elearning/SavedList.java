package org.khmeracademy.v3.entities.elearning;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SavedList {

	@JsonProperty("SAVEDLIST_ID")
	private int savedlistid;
	@JsonProperty("PLAYLIST_ID")
	private int playlistid;
	@JsonProperty("USER_ID")
	private int userid;
	@JsonProperty("VIDEO_ID")
	private int videoid;
	@JsonProperty("SAVEDLIST_NAME")
	private String savedlistname;
	@JsonProperty("THUMBNAIL")
	private String thumbnail;
	@JsonProperty("CREATED_DATE")
	private Date createddate;
	
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public int getSavedlistid() {
		return savedlistid;
	}
	public void setSavedlistid(int savedlistid) {
		this.savedlistid = savedlistid;
	}
	public int getPlaylistid() {
		return playlistid;
	}
	public void setPlaylistid(int playlistid) {
		this.playlistid = playlistid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getVideoid() {
		return videoid;
	}
	public void setVideoid(int videoid) {
		this.videoid = videoid;
	}
	public String getSavedlistname() {
		return savedlistname;
	}
	public void setSavedlistname(String savedlistname) {
		this.savedlistname = savedlistname;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

}
