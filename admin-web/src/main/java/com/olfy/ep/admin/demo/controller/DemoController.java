package com.olfy.ep.admin.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/demo")
public class DemoController {

	@RequestMapping("/init")
	public String init(){
		return "admin/init"; 
	}
}
