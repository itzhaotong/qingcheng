package com.qingcheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qingcheng.common.PageResult;
import com.qingcheng.common.Result;
import com.qingcheng.pojo.Album;
import com.qingcheng.service.AlbumService;

import java.util.*;

@RestController
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/findAll")
    public List<Album> findAll(){
        return albumService.findAll();
    }

    @GetMapping("/findPage")
    public PageResult<Album> findPage(int page, int size){
        return albumService.findPage(page, size);
    }

    @PostMapping("/findList")
    public List<Album> findList(@RequestBody Map<String,Object> searchMap){
        return albumService.findList(searchMap);
    }

    @PostMapping("/findPage")
    public PageResult<Album> findPage(@RequestBody Map<String,Object> searchMap,int page, int size){
        return  albumService.findPage(searchMap,page,size);
    }

    @GetMapping("/findById")
    public Album findById(Long id){
        return albumService.findById(id);
    }


    @PostMapping("/add")
    public Result add(@RequestBody Album album){
        albumService.add(album);
        return new Result();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Album album){
        albumService.update(album);
        return new Result();
    }

    @GetMapping("/delete")
    public Result delete(Long id){
        albumService.delete(id);
        return new Result();
    }

}
