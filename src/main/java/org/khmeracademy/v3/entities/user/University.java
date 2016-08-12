package org.khmeracademy.v3.entities.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class University {
	@JsonProperty("UNIVERSITY_ID")
	private String UniversityId;
	@JsonProperty("UNIVERSITY_NAME")
	private String UniversityName;

	public String getUniversityName() {
		return UniversityName;
	}
	public void setUniversityName(String universityName) {
		this.UniversityName = universityName;
	}
	public String getUniversityId() {
		return UniversityId;
	}
	public void setUniversityId(String universityId) {
		this.UniversityId = universityId;
	}
	

}
