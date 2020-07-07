package com.qingcheng.mapper;

import com.qingcheng.pojo.Para;

public interface ParaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Para record);

    int insertSelective(Para record);

    Para selecyPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Para record);

    int updateByPrimaryKey(Para record);
}