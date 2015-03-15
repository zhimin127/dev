package org.my.sys.service.impl;

import java.util.List;

import org.my.core.common.dao.SysResourcesMapper;
import org.my.core.common.model.SysResources;
import org.my.core.common.model.SysResourcesExample;
import org.my.core.sys.dao.SysResourceDao;
import org.my.core.sys.model.SysResource;
import org.my.sys.service.SysResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sysResourcesService")
public class SysResourceServiceImpl implements SysResourceService {

	@Autowired
	private SysResourcesMapper sysResourcesMapper;
	@Autowired
	private SysResourceDao sysResourceDao;

	public void save(SysResources resource) {
		sysResourcesMapper.insert(resource);
	}

	public List<SysResources> getAll() {
		return sysResourcesMapper.selectByExample(null);
	}

	public List<SysResource> getAllAuth() {
		return sysResourceDao.findAllAuth();
	}

	public List<SysResource> getNavResourceByRoleId(String roleId) {
		return sysResourceDao.findNavResourceByRoleId(roleId);
	}

	public SysResources getByTypeAndResourceName(String resourceType, String resourceName) {
		SysResourcesExample example = new SysResourcesExample();
		example.createCriteria().andResourceTypeEqualTo(resourceType).andResourceNameEqualTo(resourceName);
		List<SysResources> resources = sysResourcesMapper.selectByExample(example);
		if (resources.size() > 0) {
			return resources.get(0);
		}
		return null;
	}

	public List<SysResource> getByT(SysResource resource) {
		return sysResourceDao.findByT(resource);
	}

	public List<SysResource> getPageByT(SysResource resource, int page, int pageSize) {
		return sysResourceDao.findPageByT(resource, page, pageSize);
	}
}
