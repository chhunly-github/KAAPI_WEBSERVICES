package com.khmeracademy.forum.entities;

import java.io.Serializable;

/**
 * @Package com.khmeracademy.forum.models.forum;
 * @Class Dictionary
 * @author khmerAcademy
 */
public class Dictionary implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int dic_id;
	private String keyword;
	private int keyword_id;
	private String division;
	private String dic_date_create;
	private int keyword_count;
	private int dic_active;

	public Dictionary() {
		// TODO Auto-generated constructor stub
	}

	public Dictionary(int dic_id, String keyword, int keyword_id, String division, String dic_date_create,
			int keyword_count, int dic_active) {
		super();
		this.dic_id = dic_id;
		this.keyword = keyword;
		this.keyword_id = keyword_id;
		this.division = division;
		this.dic_date_create = dic_date_create;
		this.keyword_count = keyword_count;
		this.dic_active = dic_active;
	}

	public int getDic_id() {
		return dic_id;
	}

	public void setDic_id(int dic_id) {
		this.dic_id = dic_id;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getKeyword_id() {
		return keyword_id;
	}

	public void setKeyword_id(int keyword_id) {
		this.keyword_id = keyword_id;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getDic_date_create() {
		return dic_date_create;
	}

	public void setDic_date_create(String dic_date_create) {
		this.dic_date_create = dic_date_create;
	}

	public int getKeyword_count() {
		return keyword_count;
	}

	public void setKeyword_count(int keyword_count) {
		this.keyword_count = keyword_count;
	}

	public int getDic_active() {
		return dic_active;
	}

	public void setDic_active(int dic_active) {
		this.dic_active = dic_active;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
