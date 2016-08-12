package org.khmeracademy.v3.entities.user;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author User
 *
 */
public class User {
	@JsonProperty("USER_ID")
	private int userid;

	@JsonProperty("EMAIL")
	private String email;

	@JsonProperty("PASSWORD")
	private String password;

	@JsonProperty("USERNAME")
	private String username;

	@JsonProperty("GENDER")
	private String gender;

	@JsonProperty("DATE_OF_BIRTH")
	private Date dateofbirth;

	@JsonProperty("PHONE_NUMBER")
	private String phonenumber;

	@JsonProperty("REGISTER_DATE")
	private Date registerdate;

	@JsonProperty("USER_IMAGE_URL")
	private String userimageurl;

	@JsonProperty("USERTYPE_ID")
	private int usertypeid;

	@JsonProperty("POINT")
	private int point;

	@JsonProperty("UNIVERSITY_ID")
	private int universityid;

	@JsonProperty("DEPARTMENT_ID")
	private int departmentid;

	@JsonProperty("USER_STATUS")
	private int userstatus;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Date getRegisterdate() {
		return registerdate;
	}

	public void setRegisterdate(Date registerdate) {
		this.registerdate = registerdate;
	}

	public String getUserimageurl() {
		return userimageurl;
	}

	public void setUserimageurl(String userimageurl) {
		this.userimageurl = userimageurl;
	}

	public int getUsertypeid() {
		return usertypeid;
	}

	public void setUsertypeid(int usertypeid) {
		this.usertypeid = usertypeid;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getUniversityid() {
		return universityid;
	}

	public void setUniversityid(int universityid) {
		this.universityid = universityid;
	}

	public int getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}

	public int getUserstatus() {
		return userstatus;
	}

	public void setUserstatus(int userstatus) {
		this.userstatus = userstatus;
	}

}
