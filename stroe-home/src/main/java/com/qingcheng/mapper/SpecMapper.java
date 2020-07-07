package com.qingcheng.mapper;

import com.qingcheng.pojo.Spec;

public interface SpecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Spec record);

    int insertSelective(Spec record);

    Spec selecyPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Spec record);

    int updateByPrimaryKey(Spec record);
}