package org.my.sys.service;

import org.my.core.common.model.SysUsers;
import org.my.core.sys.model.SysUser;

import com.github.pagehelper.PageInfo;

public interface SysUserService {

	void save(SysUsers user);

	void saveOrUpdate(SysUsers user);

	void update(SysUsers user);

	SysUsers getByUsernameAndPassword(String username, String password);

	SysUser getByUsername(String userName);

	PageInfo<SysUsers> getPage(int page, int rows);
	
	/**
	 * 
	 * @param record
	 */
	public void saveUserRole(String userId, String roleId);

}
