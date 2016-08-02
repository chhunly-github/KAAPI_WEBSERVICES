package com.khmeracademy.forum.entities;

public class Notification {
	private int notific_id;
	private int post_id;
	private int user_id;
	private int comment_id;
	private int notific_date_create;
	
	public Notification() {
		// TODO Auto-generated constructor stub
	}

	public Notification(int notific_id, int post_id, int user_id, int comment_id, int notific_date_create) {
		super();
		this.notific_id = notific_id;
		this.post_id = post_id;
		this.user_id = user_id;
		this.comment_id = comment_id;
		this.notific_date_create = notific_date_create;
	}

	public int getNotific_id() {
		return notific_id;
	}

	public void setNotific_id(int notific_id) {
		this.notific_id = notific_id;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getComment_id() {
		return comment_id;
	}

	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}

	public int getNotific_date_create() {
		return notific_date_create;
	}

	public void setNotific_date_create(int notific_date_create) {
		this.notific_date_create = notific_date_create;
	}
	
}
