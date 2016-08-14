package org.khmeracademy.v3.entities.elearning;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vote {
	@JsonProperty("USER_ID")
	private int userid;
	@JsonProperty("VIDEO_ID")
	private int videoid;
	@JsonProperty("VOTE_TYPE")
	private int votetype;
	
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
	public int getVotetype() {
		return votetype;
	}
	public void setVotetype(int votetype) {
		this.votetype = votetype;
	}

	
}
