package com.my.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.my.core.common.model.SysRoles;
import org.my.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("role")
public class SysRoleController {

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private SysRoleService sysRoleService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index(Model model, HttpServletRequest request) {
		return new ModelAndView("role");
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public Map<String, Object> save(HttpServletRequest request, SysRoles role) {
		Map<String, Object> result = new HashMap<String, Object>();
		boolean ok = true;
		if (role.getId() == null && StringUtils.isNotBlank(role.getName())) {
			sysRoleService.save(role);
		} else {
			sysRoleService.update(role);
		}
		result.put("ok", ok);
		return result;
	}

	@RequestMapping(value = "info", method = RequestMethod.GET)
	public SysRoles info(Model model, @PathParam(value = "id") Integer id, HttpServletRequest request) {
		SysRoles role = sysRoleService.getById(id);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("ok", true);
		result.put("resource", role);
		return role;
	}

	@RequestMapping(value = "list")
	public Map<String, Object> list(Model model, @RequestParam("current") int pageNum, @RequestParam("rowCount") int pageSize, HttpServletRequest request) {
		Map<String, Object> result = new HashMap<String, Object>();
		SysRoles role = new SysRoles();
		// resource.setIsSys("0");
		if (pageSize < 0) {
			pageSize = 100;
		}
		List<SysRoles> roles = sysRoleService.getPageByT(role, pageNum, pageSize);
		PageInfo<SysRoles> pageView = new PageInfo<SysRoles>(roles);
		pageView.setPageNum(pageNum);
		result.put("ok", true);
		result.put("current", pageView.getPageNum());
		result.put("rowCount", pageView.getPageSize());
		result.put("rows", roles);
		result.put("total", pageView.getTotal());
		return result;
	}

	@RequestMapping(value = "auth")
	public ModelAndView auth(Model model){
		
		return new ModelAndView("part");
	}
}
