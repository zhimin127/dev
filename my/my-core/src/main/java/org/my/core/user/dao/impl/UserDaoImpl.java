package org.my.core.user.dao.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.my.core.user.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	private final Log logger = LogFactory.getLog(getClass());

	@Override
	public boolean login(String username, String password) {
		logger.info("user login dao");
		return false;
	}

}
