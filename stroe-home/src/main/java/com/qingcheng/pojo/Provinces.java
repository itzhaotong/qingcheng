package com.qingcheng.pojo;
import java.io.Serializable;
/**
 * provinces实体类
 * @author Administrator
 *
 */
public class Provinces implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	private String provinceid;//省份ID


	

	private String province;//省份名称

	
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
