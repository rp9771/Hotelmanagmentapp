package com.tuespot.demo.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class HrDetailsModel {
	
	private Long id;
	
	
	@NotBlank(message = "Username must not be blank")
	@Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
	private String username;
	
	
	
	@NotBlank(message = "Password must not be blank")
	@Size(min = 6, max = 20, message = "Password must be between 8 and 20 characters")
	private String password;
	
	
	public HrDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public HrDetailsModel(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "HrDetailsModel [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
	

}
