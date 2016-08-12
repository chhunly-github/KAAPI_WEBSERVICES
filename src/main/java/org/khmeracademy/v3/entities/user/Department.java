package org.khmeracademy.v3.entities.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Department {
	
	@JsonProperty("DEPARTMENT_ID")
	private String DepartmentId;
	@JsonProperty("DEPARTMENT_NAME")
	private String DepartmentName;
	
	public String getDepartmentId() {
		return DepartmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.DepartmentId = departmentId;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.DepartmentName = departmentName;
	}
}
