package com.my.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.my.core.Constants;
import org.my.core.common.model.SysRoles;
import org.my.core.sys.model.SysResource;
import org.my.sys.service.SysResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private SysResourceService sysResourceService;

	private Map<String, Object> result;

	@RequestMapping("nav")
	public Map<String, Object> nav(HttpServletRequest request) {
		result = new HashMap<String, Object>();
		//Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		SysRoles role = (SysRoles) request.getSession().getAttribute(Constants.CURRENT_ROLE);
		List<SysResource> nav = sysResourceService.findNavMenuByRoleId(role.getId());
		result.put("menus", nav);
		return result;
	}

	@RequestMapping("nav/all")
	public Map<String, Object> allNav(HttpServletRequest request) {
		result = new HashMap<String, Object>();
		List<SysResource> allNav = sysResourceService.findAllNavMenu();
		result.put("menus", allNav);
		return result;
	}

}
