package com.qingcheng.pojo;
import java.io.Serializable;
/**
 * role实体类
 * @author Administrator
 *
 */
public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	private Integer id;//ID


	

	private String name;//角色名称

	
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


	
}
