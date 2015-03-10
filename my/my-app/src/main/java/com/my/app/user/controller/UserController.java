package com.my.app.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("user")
public class UserController {

	@RequestMapping
	public ModelAndView info(){
		return new ModelAndView("error");
	}
}
