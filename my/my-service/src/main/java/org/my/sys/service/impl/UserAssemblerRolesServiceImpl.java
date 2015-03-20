package org.my.sys.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.my.core.common.model.SysRoles;
import org.my.core.sys.model.SysUser;
import org.my.sys.service.UserAssemblerRolesService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userAssemblerRolesService")
public class UserAssemblerRolesServiceImpl implements UserAssemblerRolesService {

	@Transactional(readOnly = true)
	public User buildUserFromUserEntity(SysUser userAccount) {
		String username = userAccount.getUsername();
		String password = userAccount.getPassword();
		boolean enabled = userAccount.isActive();
		boolean accountNonExpired = userAccount.isExpired();
		boolean credentialsNonExpired = userAccount.isAuthExpired();
		boolean accountNonLocked = userAccount.isLocked();

		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (SysRoles role : userAccount.getRoles()) {
			authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
		}

		return new User(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}
}
