package com.qingcheng.pojo;

import java.io.Serializable;

public class ResourceMenuKey implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer resourceId;

	private String menuId;

	public Integer getResourceId() {
		return resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId == null ? null : menuId.trim();
	}
}
