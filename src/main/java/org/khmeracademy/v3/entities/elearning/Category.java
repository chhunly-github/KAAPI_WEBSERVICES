package org.khmeracademy.v3.entities.elearning;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {
	
	@JsonProperty("VIDEO_CATEGORY_ID")
	private int videocategoryid;
	@JsonProperty("CATEGORY_NAME")
	private String categoryname;
	@JsonProperty("CATEGORY_LOGOURL")
	private String categorylogourl;
	@JsonProperty("CATEGORY_ORDER")
	private int categoryorder;
	@JsonProperty("BG_IMAGE")
	private String bgimage;
	@JsonProperty("COLOR")
	private String color;
	@JsonProperty("HAS_MAIN_CATEGORY")
	private int hasmaincategoryid;
	@JsonProperty("STATUS")
	private boolean status;
	
	List<Category> subCategory;
	List<Category> subOfSubCategory;
	
	public int getVideocategoryid() {
		return videocategoryid;
	}
	public void setVideocategoryid(int videocategoryid) {
		this.videocategoryid = videocategoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getCategorylogourl() {
		return categorylogourl;
	}
	public void setCategorylogourl(String categorylogourl) {
		this.categorylogourl = categorylogourl;
	}
	public int getCategoryorder() {
		return categoryorder;
	}
	public void setCategoryorder(int categoryorder) {
		this.categoryorder = categoryorder;
	}
	public String getBgimage() {
		return bgimage;
	}
	public void setBgimage(String bgimage) {
		this.bgimage = bgimage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getHasmaincategoryid() {
		return hasmaincategoryid;
	}
	public void setHasmaincategoryid(int hasmaincategoryid) {
		this.hasmaincategoryid = hasmaincategoryid;
	}
	public List<Category> getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(List<Category> subCategory) {
		this.subCategory = subCategory;
	}
	public List<Category> getSubOfSubCategory() {
		return subOfSubCategory;
	}
	public void setSubOfSubCategory(List<Category> subOfSubCategory) {
		this.subOfSubCategory = subOfSubCategory;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
