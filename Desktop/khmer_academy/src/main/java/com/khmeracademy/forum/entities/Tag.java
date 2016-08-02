package com.khmeracademy.forum.entities;

/**
 * @Package com.kshrd.models.forum;
 * @Class Tag
 * @author khmerAcademy
 *
 */


public class Tag {
	private int tag_id;
	private int cat_id;
	private int post_id;
	private String tag_date_create;
	private int tag_active;
	
	public Tag() {
		// TODO Auto-generated constructor stub
	}

	public Tag(int tag_id, int cat_id, int post_id, String tag_date_create, int tag_active) {
		super();
		this.tag_id = tag_id;
		this.cat_id = cat_id;
		this.post_id = post_id;
		this.tag_date_create = tag_date_create;
		this.tag_active = tag_active;
	}

	public int getTag_id() {
		return tag_id;
	}

	public void setTag_id(int tag_id) {
		this.tag_id = tag_id;
	}

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	public String getTag_date_create() {
		return tag_date_create;
	}

	public void setTag_date_create(String tag_date_create) {
		this.tag_date_create = tag_date_create;
	}

	public int getTag_active() {
		return tag_active;
	}

	public void setTag_active(int tag_active) {
		this.tag_active = tag_active;
	}
	
	
}
