package org.khmeracademy.v3.entities;

public class APIUserRole{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
/*	@Override
	public String getAuthority() {
		return name;
	}*/
}
