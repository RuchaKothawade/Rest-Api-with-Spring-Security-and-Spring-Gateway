package com.schoolBookManagement.Teacher.Services;

import java.util.List;

import com.schoolBookManagement.Teacher.Entities.User;



public interface UserService {
	
	
	//User Management
	public List<User>getUsers();
	public User getUser(long userId);
	public User addUser(User book);
	

}
