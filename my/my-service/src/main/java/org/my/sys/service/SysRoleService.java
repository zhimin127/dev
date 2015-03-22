package org.my.sys.service;

import java.util.List;

import org.my.core.common.model.SysRoles;

public interface SysRoleService {

	void save(SysRoles role);
	
	void update(SysRoles role);
	
	SysRoles getById(Integer id);
	
	List<SysRoles> getAll();

	List<SysRoles> getPageByT(SysRoles role, int pageNum, int pageSize);
	
}
