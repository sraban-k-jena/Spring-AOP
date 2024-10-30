package com.jt.spring_aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.jt.spring_aop.service.PaymentService;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAopApplication implements CommandLineRunner {

	@Autowired
	public PaymentService service;

	public static void main(String[] args) {

		SpringApplication.run(SpringAopApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		service.makePayment();
	}

}
