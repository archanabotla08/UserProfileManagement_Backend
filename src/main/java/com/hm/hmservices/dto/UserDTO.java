package com.hm.hmservices.dto;

import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class UserDTO {

//	@Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$')]", message = "Please enter valid user name")
	private String userName;
	
//	@Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$')]", message = "Please enter valid first name")
	private String firstName;
	
//	@Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$')]", message = "Please enter valid designation")
	private int designation;
	
	private String email;
	
//	@Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$')]", message = "Please enter valid address")
	private String address;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getDesignation() {
		return designation;
	}

	public void setDesignation(int designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
