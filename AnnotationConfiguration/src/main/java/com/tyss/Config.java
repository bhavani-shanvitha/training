package com.tyss;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.*;

@Configuration
@ComponentScan("com.tyss")//to which package it has to scan we have to give
public class Config {
	@Bean
	public ArrayList arraylist() {
		ArrayList a1= new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		return a1;
	}
	@Bean
	public HashSet hashset() {
		return new HashSet();
	}
}
