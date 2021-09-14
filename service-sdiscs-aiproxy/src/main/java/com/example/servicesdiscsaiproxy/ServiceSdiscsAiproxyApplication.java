package com.example.servicesdiscsaiproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
public class ServiceSdiscsAiproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceSdiscsAiproxyApplication.class, args);
	}

}
