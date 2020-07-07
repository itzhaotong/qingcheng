package com.qingcheng.mapper;

import com.qingcheng.pojo.LoginLog;

public interface LoginLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoginLog record);

    int insertSelective(LoginLog record);

    LoginLog selecyPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKey(LoginLog record);
}