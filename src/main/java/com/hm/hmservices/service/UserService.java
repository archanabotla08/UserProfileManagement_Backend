package com.hm.hmservices.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.hmservices.dto.UserDTO;
import com.hm.hmservices.exception.UserException;
import com.hm.hmservices.model.UserData;
import com.hm.hmservices.model.UserRoleData;
import com.hm.hmservices.repository.UserRepository;
import com.hm.hmservices.repository.UserRoleRepository;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserRoleRepository userRoleRepository;

	@Override
	public UserData getUserById(long id) throws UserException{
		return userRepository.findById(id)
				.orElseThrow(() -> new UserException("User " + id + " does not exists!!"));
	}

	@Override
	public UserData updateUserDataById(long id, UserDTO userDTO) throws UserException {
			UserData userData;
			userData = this.getUserById(id);
			userData.updateUserDataById(userDTO);
			return userRepository.save(userData);
	}

	@Override
	public UserRoleData getUserDesignationById(long id) throws UserException {
		return userRoleRepository.findById(id)
				.orElseThrow(() -> new UserException("UserRole for Id " + id + "does not exist"));
	}

}
