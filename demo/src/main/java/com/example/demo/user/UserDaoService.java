package com.example.demo.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static int UsersCount=3;
	private static List<User> users=new ArrayList<>();
	static {
		users.add(new User(1, "ABC", new Date()));
		users.add(new User(2, "basha", new Date()));
		users.add(new User(3, "RAhim", new Date()));
	}
	public List <User>findAll()
	{
		return users;
	}
	public User save(User user)
	{if(user.getId()==null)
	{
		user.setId(++UsersCount);
	}
	users.add(user);
	return user;
	}
	public User getOne(int id)
	{
		for(User user:users)
		{
			if(user.getId()==id)
			
				return user;
		}
		return null;
	}
}
