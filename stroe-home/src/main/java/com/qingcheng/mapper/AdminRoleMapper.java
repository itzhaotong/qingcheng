package com.qingcheng.mapper;

import com.qingcheng.pojo.AdminRoleKey;

public interface AdminRoleMapper {
    int deleteByPrimaryKey(AdminRoleKey key);

    int insert(AdminRoleKey record);

    int insertSelective(AdminRoleKey record);
}