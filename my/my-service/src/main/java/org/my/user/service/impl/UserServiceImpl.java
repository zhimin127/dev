package org.my.user.service.impl;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.my.core.user.dao.UserDao;
import org.my.user.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	private final Log logger = LogFactory.getLog(getClass());
	
	private UserDao userDao;
	
	@Override
	public boolean login(String username, String password) {
		logger.info("user login service");
		userDao.login(username, password);
		return false;
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
