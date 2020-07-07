package com.qingcheng.service;

import java.util.*;

import com.qingcheng.common.PageResult;
import com.qingcheng.pojo.Brand;

/**
 * brand业务逻辑层
 */
public interface BrandService {


    public List<Brand> findAll();


    public PageResult<Brand> findPage(int page, int size);


    public List<Brand> findList(Map<String,Object> searchMap);


    public PageResult<Brand> findPage(Map<String,Object> searchMap,int page, int size);


    public Brand findById(Integer id);

    public void add(Brand brand);


    public void update(Brand brand);


    public void delete(Integer id);

}
