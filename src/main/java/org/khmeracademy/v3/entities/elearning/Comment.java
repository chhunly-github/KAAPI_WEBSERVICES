package org.khmeracademy.v3.entities.elearning;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Comment {
	
	@JsonProperty("COMMENT_ID")
	private int commentId;
	
	@JsonProperty("COMMENT_DATE")
	private Date commentDate;
	
	@JsonProperty("COMMENT_TEXT")
	private String commentText;
	
	@JsonProperty("VIDEO_ID")
	private int videoId;
	
	@JsonProperty("USER_ID")
	private int userId;
	
	@JsonProperty("VIDEO_NAME")
	private String videoName;
	
	@JsonProperty("USER_NAME")
	private String username;
	
	@JsonProperty("USER_IMAGE_URL")
	private String userImageUrl;
	
	@JsonProperty("REPLY_ID")
	private int replyId;
	
	
	
	public int  getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserImageUrl() {
		return userImageUrl;
	}
	public void setUserImageUrl(String userImageUrl) {
		this.userImageUrl = userImageUrl;
	}
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	
}
