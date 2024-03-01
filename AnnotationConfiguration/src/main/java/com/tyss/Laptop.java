package com.tyss;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component//for beans
@Primary
public class Laptop extends Computer{
	public void compile() {
		System.out.println("code is compiled in laptop");
	}
}
