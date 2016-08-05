package org.khmeracademy.v3.entities.user;

public class UserType {

	
	private String usertypeid;
	private String usertypename;
	private boolean viewable;
	private boolean commentable;
	private boolean postable;
	private boolean deleteable;
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
