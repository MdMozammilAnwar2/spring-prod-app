/**
 * 
 */
package com.anwar.springboot.controller;


import java.sql.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anwar.springboot.dao.User;

/**
 * @author MD MOZAMMIL ANWAR
 *
 */
@RestController
@CrossOrigin
public class UserInfo {
	@GetMapping("/")
	public String greet() {
		return "Welcome to the Anwar's API";
	}
	@GetMapping("/instagram")
	public User instagramInfo() {
		User user= new User("Anwar",200,300,new Date(2000)); 
		return user;
	}
	@GetMapping("/facebook")
	public User facebookInfo() {
		User user= new User("Md Mozammil Anwar Azad",400,1300,new Date(2000)); 
		return user;
	}
	@GetMapping("/linkedin")
	public User linkedinInfo() {
		User user= new User("Md Mozammil",900,12300,new Date(2000)); 
		return user;
	}
}
