package org.khmeracademy.v3.entities.elearning;

import java.sql.Date;

public class Notification {
	private int notificationid;
	private int type;
	private String notificationtext;
	private Date notificationdate;
	private int userid;
	private int videoid;
	private int commentid;
	
	public int getNotificationid() {
		return notificationid;
	}
	public void setNotificationid(int notificationid) {
		this.notificationid = notificationid;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getNotificationtext() {
		return notificationtext;
	}
	public void setNotificationtext(String notificationtext) {
		this.notificationtext = notificationtext;
	}
	public Date getNotificationdate() {
		return notificationdate;
	}
	public void setNotificationdate(Date notificationdate) {
		this.notificationdate = notificationdate;
	}
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
	public int getCommentid() {
		return commentid;
	}
	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}

}
