package com.schoolBookManagement.SpringSecurity;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
		}

	
}
