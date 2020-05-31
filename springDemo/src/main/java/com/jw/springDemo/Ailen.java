package com.jw.springDemo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kjw97
 *
 */
public class Ailen {
	

	private Computer com;
	private int age;
	
	
	public Ailen() {
		System.out.println("Ailen");
	}
	
	public Ailen(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	public void code(){
		System.out.println("im coding in");
		com.compile();
	}
	public void setAge(int age) {
		System.out.println("age assign");
		this.age = age;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

}
