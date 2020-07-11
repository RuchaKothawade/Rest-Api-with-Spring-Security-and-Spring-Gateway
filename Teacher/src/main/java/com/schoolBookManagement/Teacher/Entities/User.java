package com.schoolBookManagement.Teacher.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
	@Id
	private long Id;
	private String  username;
	private String password;
	
	public User(long id, String username, String password) {
		super();
		Id = id;
		this.username = username;
		this.password = password;
	}
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return Id;
	}
	
	public void setId(long id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		
	}


	@Override
	public String toString() {
		return "User [Id=" + Id + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
  
}
