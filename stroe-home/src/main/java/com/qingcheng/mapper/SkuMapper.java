package com.qingcheng.mapper;

import com.qingcheng.pojo.Sku;

public interface SkuMapper {
    int deleteByPrimaryKey(String id);

    int insert(Sku record);

    int insertSelective(Sku record);

    Sku selecyPrimaryKey(String id);

    int updateByPrimaryKeySelective(Sku record);

    int updateByPrimaryKey(Sku record);
}