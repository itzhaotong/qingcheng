package com.qingcheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qingcheng.common.PageResult;
import com.qingcheng.common.Result;
import com.qingcheng.pojo.OrderLog;
import com.qingcheng.service.OrderLogService;

import java.util.*;

@RestController
@RequestMapping("/orderLog")
public class OrderLogController {

    @Autowired
    private OrderLogService orderLogService;

    @GetMapping("/findAll")
    public List<OrderLog> findAll(){
        return orderLogService.findAll();
    }

    @GetMapping("/findPage")
    public PageResult<OrderLog> findPage(int page, int size){
        return orderLogService.findPage(page, size);
    }

    @PostMapping("/findList")
    public List<OrderLog> findList(@RequestBody Map<String,Object> searchMap){
        return orderLogService.findList(searchMap);
    }

    @PostMapping("/findPage")
    public PageResult<OrderLog> findPage(@RequestBody Map<String,Object> searchMap,int page, int size){
        return  orderLogService.findPage(searchMap,page,size);
    }

    @GetMapping("/findById")
    public OrderLog findById(String id){
        return orderLogService.findById(id);
    }


    @PostMapping("/add")
    public Result add(@RequestBody OrderLog orderLog){
        orderLogService.add(orderLog);
        return new Result();
    }

    @PostMapping("/update")
    public Result update(@RequestBody OrderLog orderLog){
        orderLogService.update(orderLog);
        return new Result();
    }

    @GetMapping("/delete")
    public Result delete(String id){
        orderLogService.delete(id);
        return new Result();
    }

}
