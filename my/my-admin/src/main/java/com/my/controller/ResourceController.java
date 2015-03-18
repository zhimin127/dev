package com.my.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.my.core.common.model.SysResources;
import org.my.core.sys.model.SysResource;
import org.my.sys.service.SysResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("resource")
public class ResourceController {

	protected final Log logger = LogFactory.getLog(getClass());
	@Autowired
	private SysResourceService sysResourceService;

	private Map<String, Object> result;

	private int pageNum = 1;
	private int pageSize = 10;

	@RequestMapping
	public ModelAndView view(Model model, HttpServletRequest request) {
		// Authentication auth =
		// SecurityContextHolder.getContext().getAuthentication();
		// SysRoles role = (SysRoles)
		// request.getSession().getAttribute(Constants.CURRENT_ROLE);
		SysResource resource = new SysResource();
		//resource.setIsSys("0");
		List<SysResources> resources = sysResourceService.getPageByT(resource, pageNum, pageSize);
		PageInfo<SysResources> pageView = new PageInfo<SysResources>(resources);
		pageView.setPageNum(pageNum);
		model.addAttribute("resources", resources);
		return new ModelAndView("resource");
	}

	//@RequestMapping(value = "create", method = RequestMethod.GET)
	public ModelAndView create(Model model, HttpServletRequest request) {
		
		return  new ModelAndView("resourceInfo");
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public Map<String, Object> save(HttpServletRequest request,SysResources resource) {
		result = new HashMap<String, Object>();
		// Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		//SysRoles role = (SysRoles) request.getSession().getAttribute(Constants.CURRENT_ROLE);
		boolean ok = true;
		if(StringUtils.isBlank(resource.getResourceId())&&StringUtils.isNotBlank(resource.getResourceName())){
			resource.setResourceId(UUID.randomUUID().toString());
			sysResourceService.save(resource);
		}else{
			sysResourceService.update(resource);
		}
		result.put("ok", ok);
		return result;
	}

	@RequestMapping(value = "info", method = RequestMethod.GET)
	public Map<String, Object> info(Model model,@PathParam(value = "id") String id, HttpServletRequest request) {
		SysResources resource =  sysResourceService.getById(id);
		result = new HashMap<String, Object>();
		result.put("ok", true);
		result.put("resource", resource);
		return result;
	}

}
