package com.qingcheng.pojo;
import java.io.Serializable;
/**
 * freightTemplate实体类
 * @author Administrator
 *
 */
public class FreightTemplate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	private Integer id;//ID


	

	private String name;//模板名称

	private String type;//计费方式

	
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

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


	
}
