package com.raihan.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
//	@RequestMapping("login")
//	public String loginJsp() {
//		return "login";
//		
//	}
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("login")
	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		logger.debug("Req param is "+name);
		System.out.println("Request param is "+name);
		return "login";
	}
}
