package com.hn004.security;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id
	private Long user;
	private String username;
	private String password;
	private String role;
	
//	public User() {
//		
//	}
//	
//	public User(Long user, String username, String password, String role) {
//		super();
//		this.user = user;
//		this.username = username;
//		this.password = password;
//		this.role = role;
//	}
	public Long getUser() {
		return user;
	}
	public void setUser(Long user) {
		this.user = user;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [user=" + user + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	
	
	
	
	
	

}
