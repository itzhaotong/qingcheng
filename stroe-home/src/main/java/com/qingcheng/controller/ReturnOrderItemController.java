package com.qingcheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qingcheng.common.PageResult;
import com.qingcheng.common.Result;
import com.qingcheng.pojo.ReturnOrderItem;
import com.qingcheng.service.ReturnOrderItemService;

import java.util.*;

@RestController
@RequestMapping("/returnOrderItem")
public class ReturnOrderItemController {

    @Autowired
    private ReturnOrderItemService returnOrderItemService;

    @GetMapping("/findAll")
    public List<ReturnOrderItem> findAll(){
        return returnOrderItemService.findAll();
    }

    @GetMapping("/findPage")
    public PageResult<ReturnOrderItem> findPage(int page, int size){
        return returnOrderItemService.findPage(page, size);
    }

    @PostMapping("/findList")
    public List<ReturnOrderItem> findList(@RequestBody Map<String,Object> searchMap){
        return returnOrderItemService.findList(searchMap);
    }

    @PostMapping("/findPage")
    public PageResult<ReturnOrderItem> findPage(@RequestBody Map<String,Object> searchMap,int page, int size){
        return  returnOrderItemService.findPage(searchMap,page,size);
    }

    @GetMapping("/findById")
    public ReturnOrderItem findById(Long id){
        return returnOrderItemService.findById(id);
    }


    @PostMapping("/add")
    public Result add(@RequestBody ReturnOrderItem returnOrderItem){
        returnOrderItemService.add(returnOrderItem);
        return new Result();
    }

    @PostMapping("/update")
    public Result update(@RequestBody ReturnOrderItem returnOrderItem){
        returnOrderItemService.update(returnOrderItem);
        return new Result();
    }

    @GetMapping("/delete")
    public Result delete(Long id){
        returnOrderItemService.delete(id);
        return new Result();
    }

}
