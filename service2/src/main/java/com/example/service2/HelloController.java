package com.example.service2;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/service2/")
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello from service22222222 : "+new Date();
	}
}
