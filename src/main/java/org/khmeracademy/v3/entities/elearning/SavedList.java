package org.khmeracademy.v3.entities.elearning;

public class SavedList {

	private int savedlistid;
	private int playlistid;
	private int userid;
	private int videoid;
	private String savedlistname;
	private String thumbnail;
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
