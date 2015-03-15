package com.my.controller;

import javax.servlet.http.HttpServletRequest;

import org.my.core.Constants;
import org.my.core.common.model.SysUsers;
import org.my.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

	@Autowired
	private SysUserService userService;

	/**
	 * login page
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="login", method = RequestMethod.GET)
	public ModelAndView loginPage(Model model, HttpServletRequest request) {
		String view = "login";
		
		return new ModelAndView(view);
	}

	//@RequestMapping(method = RequestMethod.POST)
	public ModelAndView login(Model model, SysUsers user, HttpServletRequest request) {
		if (user != null) {
			user = userService.getByUsernameAndPassword(user.getUsername(), user.getPassword());
		}
		String view = "login";
		if (user == null) {
			model.addAttribute("msg", "用户名或密码错误！");
		} else {
			view = "redirect:/index.html";
			request.getSession().setAttribute(Constants.LOGIN_USER, user);
			//request.getSession().setAttribute(Constants.LOGINED, true);
		}
		return new ModelAndView(view);
	}

	@RequestMapping("logout")
	public ModelAndView logout(Model model, HttpServletRequest request) {
		request.getSession().removeAttribute(Constants.LOGIN_USER);
		//request.getSession().removeAttribute(Constants.LOGINED);

		return new ModelAndView("redirect:/login.html");
	}

}
