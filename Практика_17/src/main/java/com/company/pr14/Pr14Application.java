package com.company.pr14;
import com.company.pr14.service.Serv;
import com.company.pr14.service.SomeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@Slf4j
@EnableAspectJAutoProxy
@ComponentScan({ "com.company.pr14.*" })
public class Pr14Application implements CommandLineRunner {
	@Autowired
	Serv serv;
	@Autowired
	SomeService service;
	public static void main(String[] args) {
		SpringApplication.run(Pr14Application.class, args);
		log.info("Application started");
	}
	@Override
	public void run(String... args) throws Exception {
		serv.test();
		service.someMethod();
	}
}

