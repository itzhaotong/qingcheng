package com.qingcheng.pojo;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * provinces实体类
 * 
 * @author Administrator
 *
 */
@Table(name = "tb_provinces")
public class Provinces implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String provinceid;// 省份ID

	private String province;// 省份名称

	public String getProvinceid() {
		return provinceid;
	}

	public void setProvinceid(String provinceid) {
		this.provinceid = provinceid;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

}
