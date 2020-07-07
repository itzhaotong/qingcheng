package com.qingcheng.service;

import java.util.*;

import com.qingcheng.common.PageResult;
import com.qingcheng.pojo.Pref;

/**
 * pref业务逻辑层
 */
public interface PrefService {


    public List<Pref> findAll();


    public PageResult<Pref> findPage(int page, int size);


    public List<Pref> findList(Map<String,Object> searchMap);


    public PageResult<Pref> findPage(Map<String,Object> searchMap,int page, int size);


    public Pref findById(Integer id);

    public void add(Pref pref);


    public void update(Pref pref);


    public void delete(Integer id);

}
