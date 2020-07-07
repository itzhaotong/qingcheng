package com.qingcheng.mapper;

import com.qingcheng.pojo.CategoryBrandKey;

public interface CategoryBrandMapper {
    int deleteByPrimaryKey(CategoryBrandKey key);

    int insert(CategoryBrandKey record);

    int insertSelective(CategoryBrandKey record);
}