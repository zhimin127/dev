package com.my.app.controller.contact;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ContactController {

	@RequestMapping(value = "contact.html", method = RequestMethod.GET)
	public ModelAndView contact() {
		return new ModelAndView("contact");
	}
}
