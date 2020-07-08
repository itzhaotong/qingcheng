package com.qingcheng.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qingcheng.common.PageResult;
import com.qingcheng.common.Result;
import com.qingcheng.pojo.Menu;
import com.qingcheng.service.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;

	@GetMapping("/findAll")
	public List<Menu> findAll() {
		return menuService.findAll();
	}

	@GetMapping("/findPage")
	public PageResult<Menu> findPage(int page, int size) {
		return menuService.findPage(page, size);
	}

	@PostMapping("/findList")
	public List<Menu> findList(@RequestBody Map<String, Object> searchMap) {
		return menuService.findList(searchMap);
	}

	@PostMapping("/findPage")
	public PageResult<Menu> findPage(@RequestBody Map<String, Object> searchMap, int page, int size) {
		return menuService.findPage(searchMap, page, size);
	}

	@GetMapping("/findById")
	public Menu findById(String id) {
		return menuService.findById(id);
	}

	@PostMapping("/add")
	public Result add(@RequestBody Menu menu) {
		menuService.add(menu);
		return new Result();
	}

	@PostMapping("/update")
	public Result update(@RequestBody Menu menu) {
		menuService.update(menu);
		return new Result();
	}

	@GetMapping("/delete")
	public Result delete(String id) {
		menuService.delete(id);
		return new Result();
	}

	@GetMapping("/findMenu")
	public List<Map<String, Object>> findMenu() {
		return menuService.findAllMenu();
	}

}
