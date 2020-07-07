package com.qingcheng.service;

import java.util.*;

import com.qingcheng.common.PageResult;
import com.qingcheng.pojo.Template;

/**
 * template业务逻辑层
 */
public interface TemplateService {


    public List<Template> findAll();


    public PageResult<Template> findPage(int page, int size);


    public List<Template> findList(Map<String,Object> searchMap);


    public PageResult<Template> findPage(Map<String,Object> searchMap,int page, int size);


    public Template findById(Integer id);

    public void add(Template template);


    public void update(Template template);


    public void delete(Integer id);

}
