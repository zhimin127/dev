package com.my.app.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("user")
public class UserController {

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ModelAndView info() {
		return new ModelAndView("error");
	}
}
