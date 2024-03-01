package com.tyss;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tyss")
public class Config {
	@Bean
	public ArrayList role() {
		ArrayList a1= new ArrayList();
		a1.add("developer");
		a1.add("tester");
		a1.add("UX designer");
		a1.add("Manager");
		a1.add("SE");
		return a1;
	}
}
