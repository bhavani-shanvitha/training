package com.tyss;

import org.springframework.stereotype.Component;


public class laptop implements computer{
	public void compile() {
		System.out.println("code is compiled in laptop");
	}
}
