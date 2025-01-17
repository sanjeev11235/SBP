package com.san.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class A {

	private B b;	
	
	
	public A() {
		super();
		System.out.println("A is created.");
	}

	//constructor autowiring
	@Autowired
	public A(B b) {
		super();
		this.b = b;
		System.out.println("A is created and B is injected.");
	}	
	
	public boolean hasB() {
		
		if(b == null)
			return false;
		else
			return true;
	}
	
}
