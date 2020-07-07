package com.qingcheng.pojo;

import java.io.Serializable;

public class CategoryReport implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer num;

	    private Integer money;

	    public Integer getNum() {
	        return num;
	    }

	    public void setNum(Integer num) {
	        this.num = num;
	    }

	    public Integer getMoney() {
	        return money;
	    }

	    public void setMoney(Integer money) {
	        this.money = money;
	    }
}
