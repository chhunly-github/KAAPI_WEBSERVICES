package org.khmeracademy.v3.entities.user;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Log {

	@JsonProperty("LOG_ID")
	private String logid;
	@JsonProperty("USER_ID")
	private String userid;
	@JsonProperty("VIDEO_ID")
	private String videoid;
	@JsonProperty("VIDEO_NAME")
	private String videoname;
	@JsonProperty("VIDEO_THUMBNAIL")
	private String youtubeurl;
	@JsonProperty("START_TIME")
	private Date starttime;
	@JsonProperty("STOP_TIME")
	private Date stoptime;

	
	
	public String getLogid() {
		return logid;
	}
	public void setLogid(String logid) {
		this.logid = logid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getVideoid() {
		return videoid;
	}
	public void setVideoid(String videoid) {
		this.videoid = videoid;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getStoptime() {
		return stoptime;
	}
	public void setStoptime(Date stoptime) {
		this.stoptime = stoptime;
	}
	
	public String getLogId() {
		return logid;
	}
	public void setLogId(String logId) {
		this.logid = logId;
	}
	public String getUserId() {
		return userid;
	}
	public void setUserId(String userId) {
		this.userid = userId;
	}
	public String getVideoId() {
		return videoid;
	}
	public void setVideoId(String videoId) {
		this.videoid = videoId;
	}

}