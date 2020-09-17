package com.jenkinstest.test.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Meng
 * @Date: 2020/9/17 16:35
 */
@RestController("index")
public class IndexController {

	@GetMapping
	public String indexController(){

		return "index.html";
	}

}
