package com.ofly.ep.admin.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ofly.ep.admin.demo.api.IDemoService;

@Controller
@RequestMapping("/admin/demo")
public class DemoController {

	@Autowired
	private IDemoService demoService;
	
	@RequestMapping("/init")
	public String init(){
		demoService.query();
		return "admin/init"; 
	}
}
