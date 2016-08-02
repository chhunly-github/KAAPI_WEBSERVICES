package com.khmeracademy.forum.entities;

import java.io.Serializable;

/**
 * @Package com.khmeracademy.forum.models.forum;
 * @Class forum
 * @author khmerAcademy
 *
 */

public class Category implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cat_id;
	private String cat_name;
	private String cat_desc;
	private String cat_date_create;
	private int cat_active;
	
	
	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	public Category(int cat_id, String cat_name, String cat_desc, String cat_date_create, int cat_active) {
		super();
		this.cat_id = cat_id;
		this.cat_name = cat_name;
		this.cat_desc = cat_desc;
		this.cat_date_create = cat_date_create;
		this.cat_active = cat_active;
	}

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public String getCat_name() {
		return cat_name;
	}

	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}

	public String getCat_desc() {
		return cat_desc;
	}

	public void setCat_desc(String cat_desc) {
		this.cat_desc = cat_desc;
	}

	public String getCat_date_create() {
		return cat_date_create;
	}

	public void setCat_date_create(String cat_date_create) {
		this.cat_date_create = cat_date_create;
	}

	public int getCat_active() {
		return cat_active;
	}

	public void setCat_active(int cat_active) {
		this.cat_active = cat_active;
	}
	
	
	
}
