package com.app.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserRegister;
import com.app.dto.UserDto;
import com.app.pojos.Register;

@Service
@Transactional
public class UserService implements IuserService {
	
	

	@Autowired
	private UserRegister userReg;
	@Override
	public Register findByEmail(String email) throws Exception {
		System.out.println("in findby email");
		Register u=  userReg.findByEmail(email);
		UserDto dto= new UserDto();
		BeanUtils.copyProperties(u, dto);
		return u;	
	}
	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto addUserDetails(Register user) {
		// TODO Auto-generated method stub
		Register persistentUser=userReg.save(user);
		UserDto dto=new UserDto();
		BeanUtils.copyProperties(persistentUser, dto);
		return dto;
	}



}
