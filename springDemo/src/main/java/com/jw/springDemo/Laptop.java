package com.jw.springDemo;

import org.springframework.stereotype.Component;


public class Laptop implements Computer {
	public void compile() {
		System.out.println("laptop");
	}
}
