package com.cts.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cts.product.service,com.cts.product.dao,com.cts.product.utils")
public class AppConfig {

	public AppConfig() {
		System.out.println(">>>>>>>>> AppConfig Ob ject created <<<<<<<");
	}
	
	
	@Bean
	public void f2() {
		System.out.println(">>>>> f2 method <<<<");
	}

}
