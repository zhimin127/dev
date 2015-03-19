package org.my.core.sys.model;

import java.util.List;

import org.my.core.common.model.SysResources;
import org.my.core.common.model.SysRoles;
import org.my.core.common.model.SysStyles;

public class SysResource extends SysResources {
	
	private String roleId;

	private List<SysRoles> roles;
	
	private List<SysStyles> styles;
	
	private List<SysResource> subResources;
	
	private List<SysResource> children;

	public List<SysResource> getSubResources() {
		return subResources;
	}

	public void setSubResources(List<SysResource> subResources) {
		this.subResources = subResources;
	}

	public List<SysStyles> getStyles() {
		return styles;
	}

	public void setStyles(List<SysStyles> styles) {
		this.styles = styles;
	}

	public List<SysRoles> getRoles() {
		return roles;
	}

	public void setRoles(List<SysRoles> roles) {
		this.roles = roles;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public List<SysResource> getChildren() {
		return children;
	}

	public void setChildren(List<SysResource> children) {
		this.children = children;
	}
}
