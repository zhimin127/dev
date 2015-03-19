package org.my.core.sys.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.my.core.base.dao.impl.BaseDaoImpl;
import org.my.core.enums.MapperEnum;
import org.my.core.sys.dao.SysResourceDao;
import org.my.core.sys.model.SysResource;
import org.springframework.stereotype.Repository;

@Repository("sysResourceDao")
public class SysResourceDaoImpl extends BaseDaoImpl<SysResource> implements SysResourceDao {

	protected final Log logger = LogFactory.getLog(getClass());

	public List<SysResource> findAllAuth() {
		return getSqlSession().selectList(MapperEnum.SYS_RESOURCE.getMapperName() + ".findAllAuth");
	}

	public List<SysResource> findNavResourceByRoleId(String roleId) {
		return getSqlSession().selectList(MapperEnum.SYS_RESOURCE.getMapperName() + ".findNavResourceByRoleId", roleId);
	}

	@Override
	public List<SysResource> findAllNav() {
		return getSqlSession().selectList(MapperEnum.SYS_RESOURCE.getMapperName() + ".findAllNav");
	}

}
