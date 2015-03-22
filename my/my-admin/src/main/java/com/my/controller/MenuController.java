package com.my.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.my.core.common.model.SysRoles;
import org.my.core.sys.model.SysResource;
import org.my.sys.service.SysResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private SysResourceService sysResourceService;
	@Autowired
	private Cache myCache;

	@RequestMapping("nav")
	public Map<String, Object> nav(HttpServletRequest request) {
		Map<String, Object> result = new HashMap<String, Object>();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		logger.info(auth.getName());

		Element e = myCache.get(auth.getName());
		SysRoles role = (SysRoles) e.getObjectValue();
		logger.info(role.getName());
		List<SysResource> nav = sysResourceService.findNavMenuByRoleId(role.getId());
		result.put("menus", nav);
		return result;
	}

	@RequestMapping("nav/all")
	public Map<String, Object> allNav(HttpServletRequest request) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<SysResource> allNav = sysResourceService.findAllNavMenu();
		result.put("menus", allNav);
		return result;
	}

}
