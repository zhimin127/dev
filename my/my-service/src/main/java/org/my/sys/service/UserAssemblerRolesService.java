package org.my.sys.service;

import org.my.core.sys.model.SysUser;
import org.springframework.security.core.userdetails.User;

public interface UserAssemblerRolesService {

	User buildUserFromUserEntity(SysUser userAccount);

}
