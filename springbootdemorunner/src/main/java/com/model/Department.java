package com.model;

public class Department {
	
	private int deptId;
	private String departName;
	public Department(int countryId, String departName) {
		super();
		this.deptId = countryId;
		this.departName = departName;
	}
	public int getCountryId() {
		return deptId;
	}
	public void setCountryId(int countryId) {
		this.deptId = countryId;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	

}
