package com.app.service;

import java.util.List;
import com.app.dto.UserDto;
import com.app.pojos.Register;
public interface IuserService {

	List<UserDto> getAllUsers();
	UserDto addUserDetails(Register user);
	Register findByEmail(String email) throws Exception;
}
