package com.qingcheng.mapper;

import com.qingcheng.pojo.Areas;

public interface AreasMapper {
    int deleteByPrimaryKey(String areaid);

    int insert(Areas record);

    int insertSelective(Areas record);

    Areas selecyPrimaryKey(String areaid);

    int updateByPrimaryKeySelective(Areas record);

    int updateByPrimaryKey(Areas record);
}