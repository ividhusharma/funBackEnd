package com.aarpee.startfun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartContoller {

	@RequestMapping("/start")
	public String getStartMessage(@RequestParam String name){
		return "Welcome "+name;
	}
	
}
