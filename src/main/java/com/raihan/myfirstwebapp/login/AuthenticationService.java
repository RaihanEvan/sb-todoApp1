package com.raihan.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String name, String pass) {
		boolean isValidName = name.equalsIgnoreCase("admin");
		boolean isValidPass = pass.equalsIgnoreCase("123");
		
		return isValidName && isValidPass;
	}

}
