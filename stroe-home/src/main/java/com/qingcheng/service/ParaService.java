package com.qingcheng.service;

import java.util.*;

import com.qingcheng.common.PageResult;
import com.qingcheng.pojo.Para;

/**
 * para业务逻辑层
 */
public interface ParaService {


    public List<Para> findAll();


    public PageResult<Para> findPage(int page, int size);


    public List<Para> findList(Map<String,Object> searchMap);


    public PageResult<Para> findPage(Map<String,Object> searchMap,int page, int size);


    public Para findById(Integer id);

    public void add(Para para);


    public void update(Para para);


    public void delete(Integer id);

}
