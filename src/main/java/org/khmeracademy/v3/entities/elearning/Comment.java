package org.khmeracademy.v3.entities.elearning;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Comment {
	
	@JsonProperty("COMMENT_ID")
	private String commentId;
	
	@JsonProperty("COMMENT_DATE")
	private Date commentDate;
	
	@JsonProperty("COMMENT_TEXT")
	private String commentText;
	
	@JsonProperty("VIDEO_ID")
	private String videoId;
	
	@JsonProperty("USER_ID")
	private String userId;
	
	@JsonProperty("VIDEO_NAME")
	private String videoName;
	
	@JsonProperty("USER_NAME")
	private String username;
	
	@JsonProperty("USER_IMAGE_URL")
	private String userImageUrl;
	
	@JsonProperty("REPLY_ID")
	private String replyId;
	
	
	
	public String getCommentId() {
		return commentId;
	}
	public void setCommentId(String commentId) {
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
	public String getVideoId() {
		return videoId;
	}
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
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
	public String getReplyId() {
		return replyId;
	}
	public void setReplyId(String replyId) {
		this.replyId = replyId;
	}
	
}
