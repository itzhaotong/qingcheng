package com.qingcheng.service;

import java.util.List;
import java.util.Map;

import com.qingcheng.common.PageResult;
import com.qingcheng.pojo.Admin;

public interface AdminService {
	public List<Admin> findAll();


    public PageResult<Admin> findPage(int page, int size);


    public List<Admin> findList(Map<String,Object> searchMap);


    public PageResult<Admin> findPage(Map<String,Object> searchMap,int page, int size);


    public Admin findById(Integer id);

    public void add(Admin admin);


    public void update(Admin admin);


    public void delete(Integer id);
}
