package com.qingcheng.mapper;

import com.qingcheng.pojo.OrderItem;

public interface OrderItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selecyPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}