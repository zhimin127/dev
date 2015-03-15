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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("resource")
public class ResourceController {

	protected final Log logger = LogFactory.getLog(getClass());
	@Autowired
	private SysResourceService sysResourceService;

	private Map<String, Object> result;

	@RequestMapping
	public ModelAndView view(Model model, HttpServletRequest request) {
		//Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		//SysRoles role = (SysRoles) request.getSession().getAttribute(Constants.CURRENT_ROLE);
		SysResource resource = new SysResource();
		List<SysResource> resources = sysResourceService.getByT(resource);
		model.addAttribute("resources", resources);
		return new ModelAndView("resource");
	}
	
	@RequestMapping("create")
	public Map<String, Object> create(HttpServletRequest request) {
		result = new HashMap<String, Object>();
		//Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		SysRoles role = (SysRoles) request.getSession().getAttribute(Constants.CURRENT_ROLE);
		List<SysResource> nav = sysResourceService.getNavResourceByRoleId(role.getRoleId());
		result.put("menus", nav);
		return result;
	}

}
