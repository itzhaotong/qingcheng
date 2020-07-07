package com.qingcheng.service;

import java.util.*;

import com.qingcheng.common.PageResult;
import com.qingcheng.pojo.OrderItem;

/**
 * orderItem业务逻辑层
 */
public interface OrderItemService {


    public List<OrderItem> findAll();


    public PageResult<OrderItem> findPage(int page, int size);


    public List<OrderItem> findList(Map<String,Object> searchMap);


    public PageResult<OrderItem> findPage(Map<String,Object> searchMap,int page, int size);


    public OrderItem findById(String id);

    public void add(OrderItem orderItem);


    public void update(OrderItem orderItem);


    public void delete(String id);

}
