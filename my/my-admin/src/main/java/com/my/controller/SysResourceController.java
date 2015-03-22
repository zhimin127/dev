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
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView view(Model model, HttpServletRequest request) {
		return new ModelAndView("resource");
	}

	// @RequestMapping(value = "create", method = RequestMethod.GET)
	public ModelAndView create(Model model, HttpServletRequest request) {
		return new ModelAndView("resourceInfo");
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public Map<String, Object> save(HttpServletRequest request, SysResources resource) {
		result = new HashMap<String, Object>();
		// Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		boolean ok = true;
		if (resource.getParentId() != 0) {
			SysResources parent = sysResourceService.getById(resource.getParentId());
			resource.setLevel(parent.getLevel() + 1);
		}
		if (resource.getId() == null && StringUtils.isNotBlank(resource.getName())) {
			sysResourceService.save(resource);
		} else {
			sysResourceService.update(resource);
		}
		result.put("ok", ok);
		return result;
	}

	@RequestMapping(value = "info", method = RequestMethod.GET)
	public SysResources info(Model model, @PathParam(value = "id") Integer id, HttpServletRequest request) {
		SysResources resource = sysResourceService.getById(id);
		result = new HashMap<String, Object>();
		result.put("ok", true);
		result.put("resource", resource);
		return resource;
	}

	@RequestMapping(value = "list")
	public Map<String, Object> list(Model model, @RequestParam("current") int pageNum, @RequestParam("rowCount") int pageSize, HttpServletRequest request) {
		result = new HashMap<String, Object>();
		SysResource resource = new SysResource();
		// resource.setIsSys("0");
		if (pageSize < 0) {
			pageSize = 100;
		}
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
