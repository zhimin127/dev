package org.my.sys.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.my.core.common.dao.SysResourcesMapper;
import org.my.core.common.model.SysResources;
import org.my.core.common.model.SysResourcesExample;
import org.my.core.common.model.SysResourcesExample.Criteria;
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

	public List<SysResource> findAllAuth() {
		return sysResourceDao.findAllAuth();
	}

	public List<SysResource> findNavResourceByRoleId(String roleId) {
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

	public List<SysResource> findByT(SysResource resource) {
		return sysResourceDao.findByT(resource);
	}

	public List<SysResource> findPageByT(SysResource resource, int page, int pageSize) {
		return sysResourceDao.findPageByT(resource, page, pageSize);
	}

	public List<SysResources> getByT(SysResource resource) {
		return null;
	}

	public List<SysResources> getPageByT(SysResource resource, int page, int pageSize) {
		SysResourcesExample example = new SysResourcesExample();
		Criteria criteria =example.createCriteria();
		if(StringUtils.isNotBlank(resource.getIsSys())){
			criteria.andIsSysEqualTo(resource.getIsSys());
		}
		if(StringUtils.isNotBlank(resource.getResourceType())){
			criteria.andIsSysEqualTo(resource.getResourceType());
		}
		List<SysResources> list =  sysResourcesMapper.selectByExample(example);
		for(SysResources res:list){
			if(StringUtils.isNotBlank(res.getParentId())){
				SysResources pres = sysResourcesMapper.selectByPrimaryKey(res.getParentId());
				res.setParentId(pres.getResourceName());
			}
		}
		return list;
	}

	@Override
	public SysResources getById(String id) {
		return sysResourcesMapper.selectByPrimaryKey(id);
	}
}
