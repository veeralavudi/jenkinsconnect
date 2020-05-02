package com.technostem.jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/employee/{name}")
	public String hello(@PathVariable("name") String name) {
		Product1 product=new Product1();
		return "Hello   " + name;

	}

}
