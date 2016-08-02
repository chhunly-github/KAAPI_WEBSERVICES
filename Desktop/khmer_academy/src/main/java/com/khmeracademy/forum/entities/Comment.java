package com.khmeracademy.forum.entities;

import java.io.Serializable;

public class Comment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int comment_id;
	private String comment_text;
	private int post_id;
	private int user_id;
	private int parent_id;
	private String comment_date_create;
	private int comment_active;
	
	public Comment() {
		// TODO Auto-generated constructor stub
	} 
	
	public Comment(int comment_id, String comment_text, int post_id, int user_id, int parent_id,
			String comment_date_create, int comment_active) {
		super();
		this.comment_id = comment_id;
		this.comment_text = comment_text;
		this.post_id = post_id;
		this.user_id = user_id;
		this.parent_id = parent_id;
		this.comment_date_create = comment_date_create;
		this.comment_active = comment_active;
	}

	public int getComment_id() {
		return comment_id;
	}

	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}

	public String getComment_text() {
		return comment_text;
	}

	public void setComment_text(String comment_text) {
		this.comment_text = comment_text;
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

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public String getComment_date_create() {
		return comment_date_create;
	}

	public void setComment_date_create(String comment_date_create) {
		this.comment_date_create = comment_date_create;
	}

	public int getComment_active() {
		return comment_active;
	}

	public void setComment_active(int comment_active) {
		this.comment_active = comment_active;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}