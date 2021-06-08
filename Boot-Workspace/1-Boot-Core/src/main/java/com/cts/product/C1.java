package com.cts.product;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class C1 {

	public C1() {
		System.out.println(">>> C1 class object created...");
	}
	
	@Bean
	public void c1Method1() {
		System.out.println(">>>> c1 method1 of C1 class");
	}
	
	public void c1Method2() {
		System.out.println(">>>> c1 method2 of C1 class");
	}

}
