package com.my.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.my.core.Constants;
import org.my.core.common.model.SysRoles;
import org.my.core.sys.model.SysUser;
import org.my.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private SysUserService sysUserService;

	@RequestMapping("index")
	public ModelAndView index(HttpServletRequest request) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		logger.info(auth.getName());
		SysRoles role = (SysRoles) request.getSession().getAttribute(Constants.CURRENT_ROLE);
		if (role == null) {
			SysUser user = sysUserService.findByUsername(auth.getName());
			request.getSession().setAttribute(Constants.CURRENT_ROLE, user.getRoles().get(0));
		}
		return new ModelAndView("index");
	}

}
