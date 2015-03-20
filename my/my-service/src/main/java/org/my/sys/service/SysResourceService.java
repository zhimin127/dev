package org.my.sys.service;

import java.util.List;

import org.my.core.common.model.SysResources;
import org.my.core.sys.model.SysResource;

public interface SysResourceService {

	void save(SysResources resource);

	void update(SysResources resource);

	SysResources getById(Integer id);
	
	List<SysResources> getAll();

	SysResources getByTypeAndName(String resourceType, String resourceName);

	List<SysResources> getByT(SysResource resource);

	List<SysResources> getPageByT(SysResource resource, int page, int pageSize);

	List<SysResource> findAllAuth();
	
	List<SysResource> findByT(SysResource resource);
	
	List<SysResource> findPageByT(SysResource resource, int page, int pageSize);

	List<SysResource> findAllNavMenu();

	List<SysResource> findNavMenuByRoleId(Integer id);
}
