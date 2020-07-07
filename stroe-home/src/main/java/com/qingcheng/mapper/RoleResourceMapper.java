package com.qingcheng.mapper;

import com.qingcheng.pojo.RoleResourceKey;

public interface RoleResourceMapper {
    int deleteByPrimaryKey(RoleResourceKey key);

    int insert(RoleResourceKey record);

    int insertSelective(RoleResourceKey record);
}