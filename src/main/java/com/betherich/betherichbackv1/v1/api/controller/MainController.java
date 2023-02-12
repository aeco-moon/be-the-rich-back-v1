package com.betherich.betherichbackv1.v1.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/v1/api/main")
public class MainController {
	
	@GetMapping(value = "getHelloWorld")
	public String getHelloWorld() {
		return "HelloWorld";
	}
}