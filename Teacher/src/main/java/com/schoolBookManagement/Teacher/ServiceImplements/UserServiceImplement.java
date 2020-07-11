package com.schoolBookManagement.Teacher.ServiceImplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.schoolBookManagement.Teacher.Dao.UserDao;
import com.schoolBookManagement.Teacher.Entities.User;
import com.schoolBookManagement.Teacher.Services.UserService;

@Service
public class UserServiceImplement implements UserService {

	@Autowired
	private UserDao ud;
	
	
	private BCryptPasswordEncoder passwordEncoder= new BCryptPasswordEncoder(10) ;

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return ud.findAll();
	}

	@Override
	public User getUser(long userId) {
		// TODO Auto-generated method stub
		return ud.getOne(userId);
	}

	@Override
	public User addUser(User user) {
		System.out.println(passwordEncoder.encode(user.getPassword()));
		//user.setPassword(passwordEncoder.encode(user.getPassword()));
        
		
		
		return ud.save(user);
	}
	

}
