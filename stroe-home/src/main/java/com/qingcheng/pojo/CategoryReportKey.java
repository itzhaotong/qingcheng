package com.qingcheng.pojo;

import java.io.Serializable;
import java.util.Date;

public class CategoryReportKey implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private Integer categoryId1;

	private Integer categoryId2;

	private Integer categoryId3;

	private Date countDate;

	public Integer getCategoryId1() {
		return categoryId1;
	}

	public void setCategoryId1(Integer categoryId1) {
		this.categoryId1 = categoryId1;
	}

	public Integer getCategoryId2() {
		return categoryId2;
	}

	public void setCategoryId2(Integer categoryId2) {
		this.categoryId2 = categoryId2;
	}

	public Integer getCategoryId3() {
		return categoryId3;
	}

	public void setCategoryId3(Integer categoryId3) {
		this.categoryId3 = categoryId3;
	}

	public Date getCountDate() {
		return countDate;
	}

	public void setCountDate(Date countDate) {
		this.countDate = countDate;
	}
}
