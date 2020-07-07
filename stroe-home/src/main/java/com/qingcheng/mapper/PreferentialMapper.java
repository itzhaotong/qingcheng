package com.qingcheng.mapper;

import com.qingcheng.pojo.Preferential;

public interface PreferentialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Preferential record);

    int insertSelective(Preferential record);

    Preferential selecyPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Preferential record);

    int updateByPrimaryKey(Preferential record);
}