package org.khmeracademy.v3.entities.elearning;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Comment {
	
	@JsonProperty("COMMENT_ID")
	private String commentid;
	@JsonProperty("COMMENT_DATE")
	private Date commentdate;
	@JsonProperty("COMMENT_TEXT")
	private String commenttext;
	@JsonProperty("VIDEO_ID")
	private String videoid;
	@JsonProperty("USER_ID")
	private String userid;
	@JsonProperty("REPLY_ID")
	private String replycomid;
	public String getCommentid() {
		return commentid;
	}
	public void setCommentid(String commentid) {
		this.commentid = commentid;
	}
	public Date getCommentdate() {
		return commentdate;
	}
	public void setCommentdate(Date commentdate) {
		this.commentdate = commentdate;
	}
	public String getCommenttext() {
		return commenttext;
	}
	public void setCommenttext(String commenttext) {
		this.commenttext = commenttext;
	}
	public String getVideoid() {
		return videoid;
	}
	public void setVideoid(String videoid) {
		this.videoid = videoid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getReplycomid() {
		return replycomid;
	}
	public void setReplycomid(String replycomid) {
		this.replycomid = replycomid;
	}
	

}
