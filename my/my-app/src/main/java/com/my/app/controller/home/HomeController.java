package com.my.app.controller.home;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@RequestMapping(value = "index.html", method = RequestMethod.GET)
	public ModelAndView index(Model model) {
		
		return new ModelAndView("index");
	}
}
