package com.my.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class SysResourceController {

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
		/*SysResource resource = new SysResource();
		//resource.setIsSys("0");
		List<SysResources> resources = sysResourceService.getPageByT(resource, pageNum, pageSize);
		PageInfo<SysResources> pageView = new PageInfo<SysResources>(resources);
		pageView.setPageNum(pageNum);
		model.addAttribute("resources", resources);*/
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
		if (resource.getId() <= 0 && StringUtils.isNotBlank(resource.getName())) {
			sysResourceService.save(resource);
		}else{
			sysResourceService.update(resource);
		}
		result.put("ok", ok);
		return result;
	}

	@RequestMapping(value = "info", method = RequestMethod.GET)
	public Map<String, Object> info(Model model,@PathParam(value = "id") Integer id, HttpServletRequest request) {
		SysResources resource =  sysResourceService.getById(id);
		result = new HashMap<String, Object>();
		result.put("ok", true);
		result.put("resource", resource);
		return result;
	}

	@RequestMapping(value = "list")
	public Map<String, Object> list(Model model, HttpServletRequest request) {
		result = new HashMap<String, Object>();
		SysResource resource = new SysResource();
		//resource.setIsSys("0");
		List<SysResource> resources = sysResourceService.findPageByT(resource, pageNum, pageSize);
		PageInfo<SysResource> pageView = new PageInfo<SysResource>(resources);
		pageView.setPageNum(pageNum);
		result.put("ok", true);
		result.put("current", pageView.getPageNum());
		result.put("rowCount", pageView.getPageSize());
		result.put("rows", resources);
		result.put("total", pageView.getTotal());
		return result;
	}

}