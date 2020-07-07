package com.qingcheng.mapper;

import com.qingcheng.pojo.Ad;

public interface AdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ad record);

    int insertSelective(Ad record);

    Ad selecyPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ad record);

    int updateByPrimaryKey(Ad record);
}