package com.qingcheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qingcheng.common.PageResult;
import com.qingcheng.common.Result;
import com.qingcheng.pojo.Provinces;
import com.qingcheng.service.ProvincesService;

import java.util.*;

@RestController
@RequestMapping("/provinces")
public class ProvincesController {

    @Autowired
    private ProvincesService provincesService;

    @GetMapping("/findAll")
    public List<Provinces> findAll(){
        return provincesService.findAll();
    }

    @GetMapping("/findPage")
    public PageResult<Provinces> findPage(int page, int size){
        return provincesService.findPage(page, size);
    }

    @PostMapping("/findList")
    public List<Provinces> findList(@RequestBody Map<String,Object> searchMap){
        return provincesService.findList(searchMap);
    }

    @PostMapping("/findPage")
    public PageResult<Provinces> findPage(@RequestBody Map<String,Object> searchMap,int page, int size){
        return  provincesService.findPage(searchMap,page,size);
    }

    @GetMapping("/findById")
    public Provinces findById(String provinceid){
        return provincesService.findById(provinceid);
    }


    @PostMapping("/add")
    public Result add(@RequestBody Provinces provinces){
        provincesService.add(provinces);
        return new Result();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Provinces provinces){
        provincesService.update(provinces);
        return new Result();
    }

    @GetMapping("/delete")
    public Result delete(String provinceid){
        provincesService.delete(provinceid);
        return new Result();
    }

}
