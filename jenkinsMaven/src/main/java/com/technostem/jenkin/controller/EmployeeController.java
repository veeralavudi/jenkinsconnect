package com.technostem.jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author VEERA LAVUDI
 *
 */
@RestController
public class EmployeeController {

	@GetMapping("/employee/{name}")
	public String hello(@PathVariable("name") String name) {
		
		return "Hello   " + name;

	}

}
