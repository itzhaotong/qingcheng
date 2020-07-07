package com.qingcheng.mapper;

import com.qingcheng.pojo.ReturnCause;

public interface ReturnCauseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReturnCause record);

    int insertSelective(ReturnCause record);

    ReturnCause selecyPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReturnCause record);

    int updateByPrimaryKey(ReturnCause record);
}