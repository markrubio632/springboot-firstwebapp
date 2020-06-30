package com.model;

public class User {
	
	private String uName;
	private String email;
	private String password;
	private String department;
	private String city;
	private String country;
	private String language;
	private String hobby;
	
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public User(String uName, String email, String password, String department, String city, String country,
			String language, String hobby) {
		super();
		this.uName = uName;
		this.email = email;
		this.password = password;
		this.department = department;
		this.city = city;
		this.country = country;
		this.language = language;
		this.hobby = hobby;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	

}
