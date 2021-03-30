package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.UserRegister;
import com.app.dto.ResponseDto;
import com.app.pojos.Register;
import com.app.service.UserService;

@RestController
@RequestMapping("/Login")
public class LoginController {
	@Autowired
	private UserRegister userRegister;
	@Autowired
	UserService userService;
	@RequestMapping("/user/{email}")
	public ResponseEntity checkLogindetail(@PathVariable String email) {
		System.out.println("inside logincontroller ");
		try {
			return ResponseEntity.ok(new ResponseDto<>(userService.findByEmail(email)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return ResponseEntity.ok("user is not there");
		}
	}
	@RequestMapping("/signup")
	public String signup(Model model)
	{
		model.addAttribute("user", new Register());
		return "signup";
	}
	@RequestMapping(value="/do_register",method = RequestMethod.POST)
	public String registeruser(@ModelAttribute("user") Register user)
	{
		System.out.println("USER"+user);
	    this.userRegister.save(user);
	    
		return "signup";
	}

}
