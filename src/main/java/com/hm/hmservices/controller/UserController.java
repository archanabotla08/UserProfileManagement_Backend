package com.hm.hmservices.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hm.hmservices.dto.ResponseDTO;
import com.hm.hmservices.dto.UserDTO;
import com.hm.hmservices.exception.UserException;
import com.hm.hmservices.model.UserData;
import com.hm.hmservices.model.UserRoleData;
import com.hm.hmservices.service.IUserService;

import io.swagger.annotations.ApiOperation;


@RestController
@Component
@RequestMapping("/userService")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	
	@ApiOperation("To get user by user Id from database")
	@GetMapping("/getUser/{id}")
	public ResponseEntity<ResponseDTO> getUserDataById(@PathVariable("id") long id)
			throws UserException {
		UserData userData = null;
		userData = userService.getUserById(id);
		 String role = getUserDesignationById(userData.getDesignation());
		 userData.setRole(role);
		ResponseDTO respDTO = new ResponseDTO(200, "Retrieved User with Id Successfully!", userData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@ApiOperation("For updating a User details in database by id")
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<ResponseDTO> updateBookDataByBookId(@PathVariable("id") long id,
			@Valid @RequestBody UserDTO userDTO) throws UserException {
		UserData userData = null;
		userData = userService.updateUserDataById(id, userDTO);
		ResponseDTO respDTO = new ResponseDTO(200, "Updated User Details in Database Successfully", userData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@ApiOperation("To get user designation Id from database")
	@GetMapping("/getDesignation{id}")
	public String getUserDesignationById(@PathVariable("id") long id)
			throws UserException {
		UserRoleData userRoleData = null;
		userRoleData = userService.getUserDesignationById(id);
		ResponseDTO respDTO = new ResponseDTO(200, "Retrieved User Designation with Id Successfully!", userRoleData);
		return userRoleData.getRole();
	}
}
