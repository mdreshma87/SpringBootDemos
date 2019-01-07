package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService Service;
	
	@GetMapping("/Users")
	public List<User> retriveAllUsers()
	{
		return Service.findAll();
	}
	
	@GetMapping("/Users/{id}")
	public User retriveUser(@PathVariable int id) {
		return Service.getOne(id);
	}
}
