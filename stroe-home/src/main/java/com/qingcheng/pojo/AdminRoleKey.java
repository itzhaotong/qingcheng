package com.qingcheng.pojo;

import java.io.Serializable;

public class AdminRoleKey implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer adminId;

	private Integer roleId;

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
}
