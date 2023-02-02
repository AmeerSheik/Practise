package com.pulsar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/demo")
	public String display() {
		
		return "Fail!!!!";
	}
	
}
