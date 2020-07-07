package com.qingcheng.pojo;
import java.io.Serializable;
/**
 * cities实体类
 * @author Administrator
 *
 */
public class Cities implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	private String cityid;//城市ID


	

	private String city;//城市名称

	private String provinceid;//省份ID

	
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getProvinceid() {
		return provinceid;
	}
	public void setProvinceid(String provinceid) {
		this.provinceid = provinceid;
	}


	
}
