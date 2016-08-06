package org.khmeracademy.v3.entities.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoverPhoto {
	@JsonProperty("COVER_ID")
	private int coverid;
	@JsonProperty("COVER_PHOTO")
	private String coverphoto;
	@JsonProperty("USER_ID")
	private int userid;
	
	public int getCoverid() {
		return coverid;
	}
	public void setCoverid(int coverid) {
		this.coverid = coverid;
	}
	public String getCoverphoto() {
		return coverphoto;
	}
	public void setCoverphoto(String coverphoto) {
		this.coverphoto = coverphoto;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}

}
