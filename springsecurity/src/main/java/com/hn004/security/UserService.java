package com.hn004.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepo repo;
	
	public User createUser(User user) {
		return repo.save(user);
	}

}
