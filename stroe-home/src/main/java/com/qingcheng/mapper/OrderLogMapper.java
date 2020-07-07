package com.qingcheng.mapper;

import com.qingcheng.pojo.OrderLog;

public interface OrderLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderLog record);

    int insertSelective(OrderLog record);

    OrderLog selecyPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderLog record);

    int updateByPrimaryKey(OrderLog record);
}