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
		user = sysUserService.findByUsername("admin");
		logger.info(GsonUtil.toJson(user));
	}

	@Autowired
	private SysResourceService sysResourceService;
	//@Test
	public void getResources() {
		//SysRoles role = sysRoleService.getRoleByName(baseRole[0]);
		List<SysResource> nav = sysResourceService.findNavResourceByRoleId("818181ec4ad85c9a014ad85c9ad60000");
		
		for(SysResource sub:nav.get(0).getSubResources()){
			System.out.println(sub.getResourceName()+":" +GsonUtil.toJson(sub.getSubResources()));
		}
		//List<SysResource> res = sysResourcesService.getPageByT(null, 0, 2);
		//logger.info(GsonUtil.toJson(res));
	}
	
	@Test
	public void updateResources() {
		String id ="75129c20-0647-47c9-b467-55be876aebc9";
		SysResources resource = sysResourceService.getById(id );
		resource.setResourceName("系统");
		logger.info(GsonUtil.toJson(resource));
		sysResourceService.update(resource );
		resource = sysResourceService.getById(id );
		logger.info(GsonUtil.toJson(resource));
	}
}
