package com.technostem.jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/employee/{name}")
	public String hello(@PathVariable("name") String name) {
		Product product=new Product();
		return "Hello   " + name;

	}

}
