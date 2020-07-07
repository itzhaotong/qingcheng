package com.qingcheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qingcheng.common.PageResult;
import com.qingcheng.common.Result;
import com.qingcheng.pojo.Spu;
import com.qingcheng.service.SpuService;

import java.util.*;

@RestController
@RequestMapping("/spu")
public class SpuController {

    @Autowired
    private SpuService spuService;

    @GetMapping("/findAll")
    public List<Spu> findAll(){
        return spuService.findAll();
    }

    @GetMapping("/findPage")
    public PageResult<Spu> findPage(int page, int size){
        return spuService.findPage(page, size);
    }

    @PostMapping("/findList")
    public List<Spu> findList(@RequestBody Map<String,Object> searchMap){
        return spuService.findList(searchMap);
    }

    @PostMapping("/findPage")
    public PageResult<Spu> findPage(@RequestBody Map<String,Object> searchMap,int page, int size){
        return  spuService.findPage(searchMap,page,size);
    }

    @GetMapping("/findById")
    public Spu findById(String id){
        return spuService.findById(id);
    }


    @PostMapping("/add")
    public Result add(@RequestBody Spu spu){
        spuService.add(spu);
        return new Result();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Spu spu){
        spuService.update(spu);
        return new Result();
    }

    @GetMapping("/delete")
    public Result delete(String id){
        spuService.delete(id);
        return new Result();
    }

//    @PostMapping("/save")
//    public Result save( @RequestBody Goods goods){
//        spuService.saveGoods(goods);
//        return new Result();
//    }
//
//    @GetMapping("/findGoodsById")
//    public Goods findGoodsById(String id){
//        return spuService.findGoodsById(id);
//    }


    @PostMapping("/audit")
    public Result audit( @RequestBody Map<String,String> map ){
        spuService.audit( map.get("id"),map.get("status"),map.get("message")  );
        return new Result();
    }

    @GetMapping("/pull")
    public Result pull(String id){
        spuService.pull(id);
        return new Result();
    }

    @GetMapping("/put")
    public Result put(String id){
        spuService.put(id);
        return new Result();
    }

    @GetMapping("/putMany")
    public Result putMany(String [] ids){
        int count = spuService.putMany(ids);
        return new Result(0,"上架"+count+"个商品");
    }


}
