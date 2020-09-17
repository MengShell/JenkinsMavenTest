package com.jenkinstest.test.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Meng
 * @Date: 2020/9/17 16:35
 */
@Controller
public class IndexController {

	@GetMapping("index")
	public String indexController(){

		return "index.html";
	}

}
