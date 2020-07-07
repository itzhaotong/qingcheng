package com.qingcheng.pojo;
import java.io.Serializable;
/**
 * returnCause实体类
 * @author Administrator
 *
 */
public class ReturnCause implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	private Integer id;//ID


	

	private String cause;//原因

	private Integer seq;//排序

	private String status;//是否启用

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}

	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	
}
