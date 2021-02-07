package com.hm.hmservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;

import com.hm.hmservices.dto.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_details")
@NoArgsConstructor
@AllArgsConstructor
public @Data class UserData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long userId;
	private String firstName;
	private String userName;
	private int designation;
	@Column(name = "email_address")
	private String email;
	private String address;
	private String role;
	
	
	public UserData() {
		super();
	}
	public UserData(long userId, String firstName, String userName, int designation, String email, String address) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.userName = userName;
		this.designation = designation;
		this.email = email;
		this.address = address;
	}
	public void updateUserDataById(@Valid UserDTO userDTO) {
		this.userName = userDTO.getUserName();
		this.firstName = userDTO.getFirstName();
		this.designation = userDTO.getDesignation();
		this.email = userDTO.getEmail();
		this.address = userDTO.getAddress();
		
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}	
	
	
}
