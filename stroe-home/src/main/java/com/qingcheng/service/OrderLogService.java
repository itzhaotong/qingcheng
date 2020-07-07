package com.qingcheng.service;

import java.util.*;

import com.qingcheng.common.PageResult;
import com.qingcheng.pojo.OrderLog;

/**
 * orderLog业务逻辑层
 */
public interface OrderLogService {


    public List<OrderLog> findAll();


    public PageResult<OrderLog> findPage(int page, int size);


    public List<OrderLog> findList(Map<String,Object> searchMap);


    public PageResult<OrderLog> findPage(Map<String,Object> searchMap,int page, int size);


    public OrderLog findById(String id);

    public void add(OrderLog orderLog);


    public void update(OrderLog orderLog);


    public void delete(String id);

}
