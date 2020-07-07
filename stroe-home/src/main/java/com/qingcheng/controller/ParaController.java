package com.qingcheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qingcheng.common.PageResult;
import com.qingcheng.common.Result;
import com.qingcheng.pojo.Para;
import com.qingcheng.service.ParaService;

import java.util.*;

@RestController
@RequestMapping("/para")
public class ParaController {

    @Autowired
    private ParaService paraService;

    @GetMapping("/findAll")
    public List<Para> findAll(){
        return paraService.findAll();
    }

    @GetMapping("/findPage")
    public PageResult<Para> findPage(int page, int size){
        return paraService.findPage(page, size);
    }

    @PostMapping("/findList")
    public List<Para> findList(@RequestBody Map<String,Object> searchMap){
        return paraService.findList(searchMap);
    }

    @PostMapping("/findPage")
    public PageResult<Para> findPage(@RequestBody Map<String,Object> searchMap,int page, int size){
        return  paraService.findPage(searchMap,page,size);
    }

    @GetMapping("/findById")
    public Para findById(Integer id){
        return paraService.findById(id);
    }


    @PostMapping("/add")
    public Result add(@RequestBody Para para){
        paraService.add(para);
        return new Result();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Para para){
        paraService.update(para);
        return new Result();
    }

    @GetMapping("/delete")
    public Result delete(Integer id){
        paraService.delete(id);
        return new Result();
    }

}
