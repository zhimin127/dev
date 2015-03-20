package com.my.admin.junit;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.my.app.service.UserService;
import org.my.core.common.model.SysResources;
import org.my.core.common.model.SysUsers;
import org.my.core.sys.model.SysResource;
import org.my.core.util.GsonUtil;
import org.my.sys.service.SysResourceService;
import org.my.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:applicationContext-mvc.xml" })
public class Junit_my_admin {
	
	private final Log logger = LogFactory.getLog(getClass());
	
	//@Autowired
	private UserService userService;
	
	//@Test
	public void user(){
		logger.info("junit:"+userService.login(null, null));
	}

	@Autowired
	private SysUserService sysUserService;
	//@Test
	public void getUser() {
		SysUsers user = null;
		//user = sysUserService.getByUsernameAndPassword("admin", "admin");
		user = sysUserService.findByUsername("admin");
		user.setPassword("admin");
		sysUserService.update(user);
		user = sysUserService.getByUsernameAndPassword("admin", "admin");
		logger.info(GsonUtil.toJson(user));
	}

	@Autowired
	private SysResourceService sysResourceService;
	@Test
	public void findNav() {
		//SysRoles role = sysRoleService.getRoleByName(baseRole[0]);
		List<SysResource> nav = null;
		nav = sysResourceService.findAllNavMenu();
		//nav = sysResourceService.findNavMenuByRoleId(1);
		//nav  = sysResourceService.findPageByT(null, 1, 10);
		logger.error(nav.size());
		for(SysResource res:nav.get(0).getChildren()){
			//logger.info(GsonUtil.toJson(res));
			logger.info(res.getName()+" : " +GsonUtil.toJson(res.getChildren()));
		}
		//logger.info(GsonUtil.toJson(roleNav));
	}
	
	//@Test
	public void updateResources() {
		Integer id =1;
		SysResources resource = sysResourceService.getById(id );
		//resource.setName("系统111");
		//sysResourceService.update(resource );
		//resource = sysResourceService.getById(id );
		logger.info(GsonUtil.toJson(resource));
	}
}
