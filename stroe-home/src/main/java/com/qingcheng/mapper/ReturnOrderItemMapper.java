package com.qingcheng.mapper;

import com.qingcheng.pojo.ReturnOrderItem;

public interface ReturnOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReturnOrderItem record);

    int insertSelective(ReturnOrderItem record);

    ReturnOrderItem selecyPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReturnOrderItem record);

    int updateByPrimaryKey(ReturnOrderItem record);
}