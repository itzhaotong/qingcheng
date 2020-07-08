package com.qingcheng.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

	@GetMapping("/name")
	public Map<String, Object> showName() {
		String name = "管理员";
		Map<String, Object> map = new HashMap<>();
		map.put("name", name);
		return map;
	}

}
