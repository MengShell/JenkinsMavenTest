package com.jenkinstest.test.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Meng
 * @Date: 2020/9/17 16:35
 */
@RestController
@RequestMapping("/index")
public class IndexController {

	@RequestMapping
	public String indexController(){

		return "index.html";
	}

}
