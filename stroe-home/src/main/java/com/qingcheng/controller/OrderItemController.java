package com.qingcheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qingcheng.common.PageResult;
import com.qingcheng.common.Result;
import com.qingcheng.pojo.OrderItem;
import com.qingcheng.service.OrderItemService;

import java.util.*;

@RestController
@RequestMapping("/orderItem")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping("/findAll")
    public List<OrderItem> findAll(){
        return orderItemService.findAll();
    }

    @GetMapping("/findPage")
    public PageResult<OrderItem> findPage(int page, int size){
        return orderItemService.findPage(page, size);
    }

    @PostMapping("/findList")
    public List<OrderItem> findList(@RequestBody Map<String,Object> searchMap){
        return orderItemService.findList(searchMap);
    }

    @PostMapping("/findPage")
    public PageResult<OrderItem> findPage(@RequestBody Map<String,Object> searchMap,int page, int size){
        return  orderItemService.findPage(searchMap,page,size);
    }

    @GetMapping("/findById")
    public OrderItem findById(String id){
        return orderItemService.findById(id);
    }


    @PostMapping("/add")
    public Result add(@RequestBody OrderItem orderItem){
        orderItemService.add(orderItem);
        return new Result();
    }

    @PostMapping("/update")
    public Result update(@RequestBody OrderItem orderItem){
        orderItemService.update(orderItem);
        return new Result();
    }

    @GetMapping("/delete")
    public Result delete(String id){
        orderItemService.delete(id);
        return new Result();
    }

}
