package com.cts.product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // Auto  Discovery

//@ComponentScan("com")

public class Application {
	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		//C1 c1Obj = ac.getBean(C1.class);
		//c1Obj.c1Method2();
		
	}

}
