package com.ipg.myCourse.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginControllerWeb {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		System.out.println("===> LoginController");
		model.put("name", "iiiiam");
		return "welcome";
	}
}
