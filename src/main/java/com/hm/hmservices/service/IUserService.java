package com.hm.hmservices.service;

import javax.validation.Valid;

import com.hm.hmservices.dto.UserDTO;
import com.hm.hmservices.exception.UserException;
import com.hm.hmservices.model.UserData;
import com.hm.hmservices.model.UserRoleData;

public interface IUserService {

	UserData getUserById(long id) throws UserException;
	
	UserData updateUserDataById(long id, UserDTO userDTO) throws UserException;
	
	UserRoleData getUserDesignationById(long id) throws UserException;
}
