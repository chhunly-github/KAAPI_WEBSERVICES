package org.khmeracademy.v3.entities.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserType {

	@JsonProperty("USERTYPE_ID")
	private String usertypeid;
	@JsonProperty("USERTYPE_NAME")
	private String usertypename;
	@JsonProperty("VIEWABLE")
	private boolean viewable;
	@JsonProperty("COMMENTABLE")
	private boolean commentable;
	@JsonProperty("POSTABLE")
	private boolean postable;
	@JsonProperty("DELETABLE")
	private boolean deleteable;
	@JsonProperty("USERABLE")
	private boolean userable;
	
	public String getUsertypeid() {
		return usertypeid;
	}
	public void setUsertypeid(String usertypeid) {
		this.usertypeid = usertypeid;
	}
	public String getUsertypename() {
		return usertypename;
	}
	public void setUsertypename(String usertypename) {
		this.usertypename = usertypename;
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
	
}
