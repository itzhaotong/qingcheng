package com.qingcheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qingcheng.common.PageResult;
import com.qingcheng.common.Result;
import com.qingcheng.pojo.Activity;
import com.qingcheng.service.ActivityService;

import java.util.*;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping("/findAll")
    public List<Activity> findAll(){
        return activityService.findAll();
    }

    @GetMapping("/findPage")
    public PageResult<Activity> findPage(int page, int size){
        return activityService.findPage(page, size);
    }

    @PostMapping("/findList")
    public List<Activity> findList(@RequestBody Map<String,Object> searchMap){
        return activityService.findList(searchMap);
    }

    @PostMapping("/findPage")
    public PageResult<Activity> findPage(@RequestBody Map<String,Object> searchMap,int page, int size){
        return  activityService.findPage(searchMap,page,size);
    }

    @GetMapping("/findById")
    public Activity findById(Integer id){
        return activityService.findById(id);
    }


    @PostMapping("/add")
    public Result add(@RequestBody Activity activity){
        activityService.add(activity);
        return new Result();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Activity activity){
        activityService.update(activity);
        return new Result();
    }

    @GetMapping("/delete")
    public Result delete(Integer id){
        activityService.delete(id);
        return new Result();
    }

}
