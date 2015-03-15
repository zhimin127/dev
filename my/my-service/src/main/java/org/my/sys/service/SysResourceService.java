package org.my.sys.service;

import java.util.List;

import org.my.core.common.model.SysResources;
import org.my.core.sys.model.SysResource;

public interface SysResourceService {

	void save(SysResources resource);
	
	List<SysResources> getAll();

	List<SysResource> getAllAuth();

	List<SysResource> getNavResourceByRoleId(String roleId);

	SysResources getByTypeAndResourceName(String resourceType, String resourceName);

	List<SysResource> getByT(SysResource resource);

	List<SysResource> getPageByT(SysResource resource, int page, int pageSize);
}
