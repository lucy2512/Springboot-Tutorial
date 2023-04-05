package com.parthib.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private AuthenticationService authenticationservice;
	
	
	public LoginController(AuthenticationService authenticationservice) {
		super();
		this.authenticationservice = authenticationservice;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String GotoLoginPage() {
		return "Login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String GotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		if(authenticationservice.authenticate(name,password)) {
		model.put("name", name);
		return "Welcome";
		}
		model.put("errorMessage", "Invalid credentials! Please try again with right credentials");
		return "Login";
	}
	
	
}
