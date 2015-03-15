package org.my.core.enums;

public enum MapperEnum {

	SYS_USER(0, "SysUser", "后台用户"), 
	SYS_RESOURCE(1, "SysResource", "后台资源"), 
	SYS_STYLE(2, "SysStyle", "后台样式"), 
	SYS_ROLE(1, "SysRole", "后台角色");

	private Integer code;
	private String mapperName;
	private String desc;

	private MapperEnum(Integer code, String name, String desc) {
		this.code = code;
		this.mapperName = name + "Mapper";
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMapperName() {
		return mapperName;
	}

	public void setMapperName(String mapperName) {
		this.mapperName = mapperName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
