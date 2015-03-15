package org.my.core.sys.dao;

import java.util.Map;

import org.my.core.base.dao.BaseDao;
import org.my.core.sys.model.SysUser;

public interface SysUserDao extends BaseDao<SysUser>{

	public SysUser findByUserName(String username);

	public void addUserRole(Map<String, String> record);

}
