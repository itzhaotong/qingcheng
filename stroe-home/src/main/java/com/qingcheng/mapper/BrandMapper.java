package com.qingcheng.mapper;

import com.qingcheng.pojo.Brand;

public interface BrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selecyPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}