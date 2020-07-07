package com.qingcheng.mapper;

import com.qingcheng.pojo.Provinces;

public interface ProvincesMapper {
    int deleteByPrimaryKey(String provinceid);

    int insert(Provinces record);

    int insertSelective(Provinces record);

    Provinces selecyPrimaryKey(String provinceid);

    int updateByPrimaryKeySelective(Provinces record);

    int updateByPrimaryKey(Provinces record);
}