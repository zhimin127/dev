package com.my.app.junit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.my.app.service.UserService;
import org.my.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:applicationContext-mvc.xml" })
public class Junit_my_app {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private UserService userService;
	@Autowired
	private SysUserService sysUserService;
	
	@Test
	public void user(){
		logger.info("junit:"+userService.login(null, null));
	}

}
