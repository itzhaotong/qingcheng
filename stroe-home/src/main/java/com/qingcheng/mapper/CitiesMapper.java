package com.qingcheng.mapper;

import com.qingcheng.pojo.Cities;

public interface CitiesMapper {
    int deleteByPrimaryKey(String cityid);

    int insert(Cities record);

    int insertSelective(Cities record);

    Cities selecyPrimaryKey(String cityid);

    int updateByPrimaryKeySelective(Cities record);

    int updateByPrimaryKey(Cities record);
}