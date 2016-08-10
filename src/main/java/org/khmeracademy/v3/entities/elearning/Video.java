package org.khmeracademy.v3.entities.elearning;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Video {

	@JsonProperty("VIDEO_ID")
	private String videoId;
	@JsonProperty("VIDEO_NAME")
	private String videoName;
	@JsonProperty("DESCRIPTION")
	private String description;
	@JsonProperty("YOUTUBE_URL")
	private String youtubeUrl;
	@JsonProperty("FILE_URL")
	private String fileUrl;
	@JsonProperty("PUBLIC_VIEW")
	private boolean publicView;
	@JsonProperty("POST_DATE")
	private Date postDate;
	@JsonProperty("USER_ID")
	private String userId;
	@JsonProperty("USERNAME")
	private String username;
	@JsonProperty("CATEGORY_NAME")
	private String categoryName;	//e.g. "Java, Jsp, J2EE, " it's multiple concated string
	@JsonProperty("COUNT_VOTE_PLUS")
	private int countVotePlus;
	@JsonProperty("COUNT_VOTE_MINUS")
	private int countVoteMinus;
	@JsonProperty("COUNT_COMMENTS")
	private int countComments;
	@JsonProperty("VIEW_COUNTS")
	private int viewCounts;
	@JsonProperty("USER_IMAGE_URL")
	private String userImageUrl;
	@JsonProperty("STATUS")
	private boolean status;
	/*private String []categoryId;*/
	
	public String getVideoId() {
		return videoId;
	}
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getYoutubeUrl() {
		return youtubeUrl;
	}
	public void setYoutubeUrl(String youtubeUrl) {
		this.youtubeUrl = youtubeUrl;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public boolean isPublicView() {
		return publicView;
	}
	public void setPublicView(boolean publicView) {
		this.publicView = publicView;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getCountVotePlus() {
		return countVotePlus;
	}
	public void setCountVotePlus(int countVotePlus) {
		this.countVotePlus = countVotePlus;
	}
	public int getCountVoteMinus() {
		return countVoteMinus;
	}
	public void setCountVoteMinus(int countVoteMinus) {
		this.countVoteMinus = countVoteMinus;
	}
	public int getCountComments() {
		return countComments;
	}
	public void setCountComments(int countComments) {
		this.countComments = countComments;
	}
	public int getViewCounts() {
		return viewCounts;
	}
	public void setViewCounts(int viewCounts) {
		this.viewCounts = viewCounts;
	}
	public String getUserImageUrl() {
		return userImageUrl;
	}
	public void setUserImageUrl(String userImageUrl) {
		this.userImageUrl = userImageUrl;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
/*	public String[] getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String[] categoryId) {
		this.categoryId = categoryId;
	}*/
	
}
