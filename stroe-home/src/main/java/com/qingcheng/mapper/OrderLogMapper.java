package com.qingcheng.mapper;

import com.qingcheng.pojo.OrderLog;

import tk.mybatis.mapper.common.Mapper;

public interface OrderLogMapper extends Mapper<OrderLog> {
	int deleteByPrimaryKey(String id);

	@Override
	int insert(OrderLog record);

	@Override
	int insertSelective(OrderLog record);

	OrderLog selecyPrimaryKey(String id);

	@Override
	int updateByPrimaryKeySelective(OrderLog record);

	@Override
	int updateByPrimaryKey(OrderLog record);
}