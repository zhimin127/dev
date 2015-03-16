package org.my.core.sys.dao.impl;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.my.core.base.dao.impl.BaseDaoImpl;
import org.my.core.enums.MapperEnum;
import org.my.core.sys.dao.SysUserDao;
import org.my.core.sys.model.SysUser;
import org.springframework.stereotype.Repository;

@Repository("sysUserDao")
public class SysUserDaoImpl extends BaseDaoImpl<SysUser> implements SysUserDao {

	protected final Log logger = LogFactory.getLog(getClass());

	public SysUser findByUsername(String username) {
		return getSqlSession().selectOne(MapperEnum.SYS_USER.getMapperName() + ".findByUsername", username);
	}

	public void addUserRole(Map<String, String> record) {
		Object id = getSqlSession().selectOne(MapperEnum.SYS_USER.getMapperName() + ".findUserRoleByUserIdAndRoleId", record);
		logger.info(id);
		if (id == null) {
			getSqlSession().insert(MapperEnum.SYS_USER.getMapperName() + ".insertUserRole", record);
		}
	}

}
