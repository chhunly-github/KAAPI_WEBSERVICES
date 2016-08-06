package org.khmeracademy.v3.entities.elearning;

public class Vote {
	private int userid;
	private int videoid;
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
