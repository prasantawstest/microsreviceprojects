package com.example.service1;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/service1/")
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello from service11111111 : "+(new Date());
	}
}
