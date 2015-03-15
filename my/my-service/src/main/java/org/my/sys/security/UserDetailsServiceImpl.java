package org.my.sys.security;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.my.core.sys.model.SysUser;
import org.my.sys.service.SysUserService;
import org.my.sys.service.UserAssemblerRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserCache;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

//@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private SysUserService userService;
	@Autowired
	private UserCache userCache;
	@Autowired
	private UserAssemblerRolesService userAssemblerRolesService;
	@Autowired
	private MessageSource messageSource;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.info("============================== 1.用户 " + username + " ============================== ");
		User user = null;// (User) this.userCache.getUserFromCache(username);
		if (user == null) {
			SysUser userAccount = userService.getByUsername(username);
			if (userAccount == null) {
				throw new UsernameNotFoundException("用户名不存在！");
			}
			user = userAssemblerRolesService.buildUserFromUserEntity(userAccount);
		}
		this.userCache.putUserInCache(user);
		//logger.info(JSONUtil.toJson(user));
		return user;
	}

}
