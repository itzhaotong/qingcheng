package com.qingcheng.mapper;

import com.qingcheng.pojo.Pref;

public interface PrefMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pref record);

    int insertSelective(Pref record);

    Pref selecyPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pref record);

    int updateByPrimaryKey(Pref record);
}