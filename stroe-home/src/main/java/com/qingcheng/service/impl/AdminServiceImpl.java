package com.qingcheng.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.qingcheng.common.PageResult;
import com.qingcheng.pojo.Admin;
import com.qingcheng.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageResult<Admin> findPage(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> findList(Map<String, Object> searchMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageResult<Admin> findPage(Map<String, Object> searchMap, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
