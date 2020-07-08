package com.qingcheng.pojo;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * template实体类
 * 
 * @author Administrator
 *
 */
@Table(name = "tb_template")
public class Template implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;// ID

	private String name;// 模板名称

	private Integer specNum;// 规格数量

	private Integer paraNum;// 参数数量

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSpecNum() {
		return specNum;
	}

	public void setSpecNum(Integer specNum) {
		this.specNum = specNum;
	}

	public Integer getParaNum() {
		return paraNum;
	}

	public void setParaNum(Integer paraNum) {
		this.paraNum = paraNum;
	}

}
