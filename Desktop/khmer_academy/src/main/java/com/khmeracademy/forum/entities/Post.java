package com.khmeracademy.forum.entities;

import java.io.Serializable;

public class Post implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int post_id;
	private String post_title;
	private String post_desc;
	private String post_date_create;
	private int cat_id;
	private int user_id;
	private int post_active;
	
	
	public Post() {
		// TODO Auto-generated constructor stub
	}
	
	public Post(int post_id, String post_title, String post_desc, String post_date_create, int cat_id, int user_id,
			int post_active) {
		super();
		this.post_id = post_id;
		this.post_title = post_title;
		this.post_desc = post_desc;
		this.post_date_create = post_date_create;
		this.cat_id = cat_id;
		this.user_id = user_id;
		this.post_active = post_active;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getPost_title() {
		return post_title;
	}
	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}
	public String getPost_desc() {
		return post_desc;
	}
	public void setPost_desc(String post_desc) {
		this.post_desc = post_desc;
	}
	public String getPost_date_create() {
		return post_date_create;
	}
	public void setPost_date_create(String post_date_create) {
		this.post_date_create = post_date_create;
	}
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getPost_active() {
		return post_active;
	}
	public void setPost_active(int post_active) {
		this.post_active = post_active;
	}
	
	
	
}
