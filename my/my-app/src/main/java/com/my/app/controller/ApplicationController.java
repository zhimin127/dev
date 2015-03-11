package com.my.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApplicationController {

	@RequestMapping(value = "error.html", method = RequestMethod.GET)
	public ModelAndView error() {
		return new ModelAndView("error");
	}
}
