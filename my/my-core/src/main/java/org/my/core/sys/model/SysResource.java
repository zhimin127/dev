package org.my.core.sys.model;

import java.util.List;

import org.my.core.common.model.SysResources;
import org.my.core.common.model.SysRoles;
import org.my.core.common.model.SysStyles;

public class SysResource extends SysResources {

	private Integer roleId;
	private SysStyles style;
	private SysResources parent;
	private List<SysRoles> roles;
	private List<SysResource> children;

	public SysStyles getStyle() {
		return style;
	}

	public void setStyle(SysStyles style) {
		this.style = style;
	}

	public List<SysRoles> getRoles() {
		return roles;
	}

	public void setRoles(List<SysRoles> roles) {
		this.roles = roles;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public List<SysResource> getChildren() {
		return children;
	}

	public void setChildren(List<SysResource> children) {
		this.children = children;
	}

	public SysResources getParent() {
		return parent;
	}

	public void setParent(SysResources parent) {
		this.parent = parent;
	}

	public String getParentName() {
		if (parent != null) {
			return parent.getName();
		}
		return null;
	}
}
