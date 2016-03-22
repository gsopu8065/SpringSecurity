package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/user/index", method = RequestMethod.GET)
	public String welcomePage() {
		return "hello";
	}

	@RequestMapping(value = "/admin/index", method = RequestMethod.GET)
	public String adminPage() {
		return "admin";
	}

}