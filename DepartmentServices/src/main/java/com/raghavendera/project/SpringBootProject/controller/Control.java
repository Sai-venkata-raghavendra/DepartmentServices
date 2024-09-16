package com.raghavendera.project.SpringBootProject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {

	//@RequestMapping(value="/hello", method=RequestMethod.GET)
	@GetMapping(value="/hello")
	public String hello(){
		return "Hello SaiKJhgtyhjk";
		
	}
}
