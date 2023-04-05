package com.parthib.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		boolean isValidUser = username.equalsIgnoreCase("Lucy");
		boolean isValidPAssword = password.equalsIgnoreCase("admin");
		
		return (isValidPAssword && isValidUser);
	}
}
