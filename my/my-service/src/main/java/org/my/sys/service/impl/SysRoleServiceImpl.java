package org.my.sys.service.impl;

import java.util.List;

import org.my.core.common.dao.SysRolesMapper;
import org.my.core.common.model.SysRoles;
import org.my.core.common.model.SysRolesExample;
import org.my.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	private SysRolesMapper sysRolesMapper;

	@Override
	public void save(SysRoles role) {
		sysRolesMapper.insert(role);
	}

	@Override
	public void update(SysRoles role) {
		sysRolesMapper.updateByPrimaryKeySelective(role);
	}

	@Override
	public SysRoles getById(Integer id) {
		return sysRolesMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysRoles> getAll() {
		return sysRolesMapper.selectByExample(null);
	}

	@Override
	public List<SysRoles> getPageByT(SysRoles role, int pageNum, int pageSize) {
		SysRolesExample example = new SysRolesExample();
		PageHelper.startPage(pageNum, pageSize).count(true).pageSizeZero(false).reasonable(true);
		List<SysRoles> list = sysRolesMapper.selectByExample(example);
		return list;
	}

}
