package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@ComponentScan({"com.example.demo.controller","com.example.demo.model","com.example.demo.repository","com.example.demo.service" ,"com.example.demo.security","com.example.demo.jwtUtil"})
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class VoterServiceGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoterServiceGatewayApplication.class, args);
	}


}
