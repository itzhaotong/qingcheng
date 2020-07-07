package com.qingcheng.mapper;

import com.qingcheng.pojo.FreightTemplate;

public interface FreightTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FreightTemplate record);

    int insertSelective(FreightTemplate record);

    FreightTemplate selecyPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FreightTemplate record);

    int updateByPrimaryKey(FreightTemplate record);
}