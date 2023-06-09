package com.raihan.myfirstwebapp.login;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	private AuthenticationService as;
	
	
//	@RequestMapping("login")
//	public String loginJsp() {
//		return "login";
//		
//	}
//	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public LoginController(AuthenticationService as) {
		super();
		this.as = as;
	}

	@RequestMapping(value="login",method=RequestMethod.GET)
	public String gotoLoginPage() {
//		@RequestParam String name, ModelMap model
//		model.put("name", name);
//		logger.debug("Req param is "+name);
//		System.out.println("Request param is "+name);
		return "login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name,@RequestParam String pass, ModelMap model) {
			if(as.authenticate(name,pass)) {
			model.put("name",name);
			return "welcome";
		}
	model.put("errorMessage","Invalid Credentials");
	return "login";

	}
}
