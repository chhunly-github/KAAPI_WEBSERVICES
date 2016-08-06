package org.khmeracademy.v3.entities.user;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author User
 *
 */
public class User {
	@JsonProperty("USER_ID")
	private String userId;
	@JsonProperty("EMAIL")
	private String email;
	@JsonProperty("PASSWORD")
	private String password;
	@JsonProperty("USERNAME")
	private String username;
	@JsonProperty("GENDER")
	private String gender;
	@JsonProperty("DATE_OF_BIRTH")
	private Date dateOfBirth;
	@JsonProperty("PHONE_NUMBER")
	private String phoneNumber;
	@JsonProperty("REGISTER_DATE")
	private Date registerDate;
	@JsonProperty("USER_IMAGE_URL")
	private String userImageUrl;
	@JsonProperty("USERTYPE_ID")
	private String userTypeId;
	@JsonProperty("USER_TYPENAME")
	private String userTypeName;
	@JsonProperty("COUNT_VIDEOS")
	private int countVideos;
	@JsonProperty("COUNT_VOTE_PLUS")
	private int countVotePlus;
	@JsonProperty("COUNT_VOTE_MINUS")
	private int countVoteMinus;
	@JsonProperty("COUNT_COMMENTS")
	private int countComments;
	@JsonProperty("COUNT_PLAYLISTS")
	private int countPlaylists;
	@JsonProperty("VIEWABLE")
	private boolean viewable;
	@JsonProperty("COMMENTABLE")
	private boolean commentable;
	@JsonProperty("POSTABLE")
	private boolean postable;
	@JsonProperty("DELETEABLE")
	private boolean deleteable;
	@JsonProperty("USERABLE")
	private boolean userable;
	@JsonProperty("COVER_PHOTO")
	private String coverphoto;
//	private String school;
	@JsonProperty("UNIVERSITY_ID")
	private String universityId;
	@JsonProperty("DEPARTMENT_ID")
	private String departmentId;
	@JsonProperty("UNIVERSITY_NAME")
	private String universityName;
	@JsonProperty("DEPARTMENT_NAME")
	private String departmentName;
	@JsonProperty("POINT")
	private int point;
	@JsonProperty("USER_STATUS")
	private int userStatus;
	@JsonProperty("IS_COMFIRMED")
	private boolean isConfirmed;
	@JsonProperty("SOCIAL_ID")
	private String socialId;
	@JsonProperty("ORIGINAL_ID")
	private int originalID;
	@JsonProperty("START_DATE")
	private String startDate;
	@JsonProperty("UNTIL_DATE")
	private String untilDate;
	 
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getUntilDate() {
		return untilDate;
	}
	public void setUntilDate(String untilDate) {
		this.untilDate = untilDate;
	}
	
	public int getOriginalID() {
		return originalID;
	}
	public void setOriginalID(int originalID) {
		this.originalID = originalID;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getUserImageUrl() {
		return userImageUrl;
	}
	public void setUserImageUrl(String userImageUrl) {
		this.userImageUrl = userImageUrl;
	}
	public String getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(String userTypeId) {
		this.userTypeId = userTypeId;
	}
	public String getUserTypeName() {
		return userTypeName;
	}
	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}
	public int getCountVideos() {
		return countVideos;
	}
	public void setCountVideos(int countVideos) {
		this.countVideos = countVideos;
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
	public int getCountPlaylists() {
		return countPlaylists;
	}
	public void setCountPlaylists(int countPlaylists) {
		this.countPlaylists = countPlaylists;
	}
	public boolean isViewable() {
		return viewable;
	}
	public void setViewable(boolean viewable) {
		this.viewable = viewable;
	}
	public boolean isCommentable() {
		return commentable;
	}
	public void setCommentable(boolean commentable) {
		this.commentable = commentable;
	}
	public boolean isPostable() {
		return postable;
	}
	public void setPostable(boolean postable) {
		this.postable = postable;
	}
	public boolean isDeleteable() {
		return deleteable;
	}
	public void setDeleteable(boolean deleteable) {
		this.deleteable = deleteable;
	}
	public boolean isUserable() {
		return userable;
	}
	public void setUserable(boolean userable) {
		this.userable = userable;
	}
	public String getCoverphoto() {
		return coverphoto;
	}
	public void setCoverphoto(String coverphoto) {
		this.coverphoto = coverphoto;
	}
	public String getUniversityId() {
		return universityId;
	}
	public void setUniversityId(String universityId) {
		this.universityId = universityId;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public boolean isConfirmed() {
		return isConfirmed;
	}
	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	public String getSocialId() {
		return socialId;
	}
	public void setSocialId(String socialId) {
		this.socialId = socialId;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	
	
	
	
}
