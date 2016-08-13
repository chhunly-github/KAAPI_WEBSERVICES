package org.khmeracademy.v3.entities.user;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudiedCourse {
	@JsonProperty("PLAYLIST_ID")
	private int playlistid;
	@JsonProperty("STATRT_DATE")
	private Date startdate;
	@JsonProperty("PLAYLIST_NAME")
	private String playlistname;
	
	public int getPlaylistid() {
		return playlistid;
	}
	public void setPlaylistid(int playlistid) {
		this.playlistid = playlistid;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public String getPlaylistname() {
		return playlistname;
	}
	public void setPlaylistname(String playlistname) {
		this.playlistname = playlistname;
	}

}
