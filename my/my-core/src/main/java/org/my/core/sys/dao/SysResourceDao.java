package org.my.core.sys.dao;

import java.util.List;

import org.my.core.base.dao.BaseDao;
import org.my.core.sys.model.SysResource;

public interface SysResourceDao extends BaseDao<SysResource> {

	List<SysResource> findAllAuth();

	List<SysResource> findNavResourceByRoleId(String roleId);

}
