package com.qingcheng.mapper;

import com.qingcheng.pojo.ReturnOrder;

public interface ReturnOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReturnOrder record);

    int insertSelective(ReturnOrder record);

    ReturnOrder selecyPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReturnOrder record);

    int updateByPrimaryKey(ReturnOrder record);
}