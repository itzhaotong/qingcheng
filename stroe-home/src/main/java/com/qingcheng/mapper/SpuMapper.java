package com.qingcheng.mapper;

import com.qingcheng.pojo.Spu;

public interface SpuMapper {
    int deleteByPrimaryKey(String id);

    int insert(Spu record);

    int insertSelective(Spu record);

    Spu selecyPrimaryKey(String id);

    int updateByPrimaryKeySelective(Spu record);

    int updateByPrimaryKeyWithBLOBs(Spu record);

    int updateByPrimaryKey(Spu record);
}