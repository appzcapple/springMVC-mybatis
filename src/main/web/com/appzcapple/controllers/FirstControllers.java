package com.appzcapple.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class FirstControllers {
	
	@RequestMapping(value = "/hello" , method = RequestMethod.GET)
	@ResponseBody
	public String hello() {
		return "hello, boy!";
	}
	
}
