package com.qingcheng.pojo;
import java.io.Serializable;
/**
 * areas实体类
 * @author Administrator
 *
 */
public class Areas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	private String areaid;//区域ID


	

	private String area;//区域名称

	private String cityid;//城市ID

	
	public String getAreaid() {
		return areaid;
	}
	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}

	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}


	
}
