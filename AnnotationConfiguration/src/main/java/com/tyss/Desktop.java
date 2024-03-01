package com.tyss;

import org.springframework.stereotype.Component;

@Component
public class Desktop extends Computer{
	public void compile() {
		System.out.println("code is compiled in desktop");
	}

}
