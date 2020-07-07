package com.qingcheng.mapper;

import com.qingcheng.pojo.CategoryReport;
import com.qingcheng.pojo.CategoryReportKey;

public interface CategoryReportMapper {
    int deleteByPrimaryKey(CategoryReportKey key);

    int insert(CategoryReport record);

    int insertSelective(CategoryReport record);

    CategoryReport selecyPrimaryKey(CategoryReportKey key);

    int updateByPrimaryKeySelective(CategoryReport record);

    int updateByPrimaryKey(CategoryReport record);
}