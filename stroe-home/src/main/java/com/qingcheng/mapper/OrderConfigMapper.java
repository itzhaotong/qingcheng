package com.qingcheng.mapper;

import com.qingcheng.pojo.OrderConfig;

public interface OrderConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderConfig record);

    int insertSelective(OrderConfig record);

    OrderConfig selecyPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderConfig record);

    int updateByPrimaryKey(OrderConfig record);
}