package com.my.app.controller.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EditorController {

	@RequestMapping(value = "editor.html", method = RequestMethod.GET)
	public ModelAndView about() {
		return new ModelAndView("editor");
	}
}
