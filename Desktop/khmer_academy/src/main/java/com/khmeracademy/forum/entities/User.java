package com.khmeracademy.forum.entities;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable{
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private int userid;
     private String email;
     private String password;
     private String username;
     private String gender;
     private Date dateofbirth;
     private String phonenumber;
     private Date registerdate;
     private String userimageurl;
     private int usertypeid;
     private int point;
     private int universityid;
     private int departmentid;
     private boolean userstatus;
     public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String email, String password, String username, String gender, Date dateofbirth,
			String phonenumber, Date registerdate, String userimageurl, int usertypeid, int point,
			int universityid, int departmentid, boolean userstatus) {
		super();
		this.userid = userid;
		this.email = email;
		this.password = password;
		this.username = username;
		this.gender = gender;
		this.dateofbirth = dateofbirth;
		this.phonenumber = phonenumber;
		this.registerdate = registerdate;
		this.userimageurl = userimageurl;
		this.usertypeid = usertypeid;
		this.point = point;
		this.universityid = universityid;
		this.departmentid = departmentid;
		this.userstatus = userstatus;
	}
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
	public void setUniversityid(int university_id) {
		this.universityid = university_id;
	}
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public boolean isUserstatus() {
		return userstatus;
	}
	public void setUserstatus(boolean userstatus) {
		this.userstatus = userstatus;
	}
     
}
