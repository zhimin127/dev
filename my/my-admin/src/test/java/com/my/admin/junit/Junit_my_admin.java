package com.my.admin.junit;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.my.core.common.model.SysUsers;
import org.my.core.sys.model.SysResource;
import org.my.core.util.GsonUtil;
import org.my.sys.service.SysResourceService;
import org.my.sys.service.SysUserService;
import org.my.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:applicationContext-mvc.xml" })
public class Junit_my_admin {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	//@Autowired
	private UserService userService;
	
	//@Test
	public void user(){
		logger.info("junit:"+userService.login(null, null));
	}

	//@Autowired
	private SysUserService sysUserService;
	//@Test
	public void getUser() {
		SysUsers user = sysUserService.getByUsernameAndPassword("admin", "admin");
		user = sysUserService.getByUsername("admin");
		logger.info(GsonUtil.toJson(user));
	}

	@Autowired
	private SysResourceService sysResourcesService;
	@Test
	public void getResources() {
		//SysRoles role = sysRoleService.getRoleByName(baseRole[0]);
		List<SysResource> nav = sysResourcesService.getNavResourceByRoleId("818181ec4ad85c9a014ad85c9ad60000");
		
		for(SysResource sub:nav.get(0).getSubResources()){
			System.out.println(sub.getResourceName()+":" +GsonUtil.toJson(sub.getSubResources()));
		}
		//List<SysResource> res = sysResourcesService.getPageByT(null, 0, 2);
		//logger.info(GsonUtil.toJson(res));
	}
}
