package com.san;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.san.beans.A;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(Main.class, args);
		
		System.out.println("Application is started, requesting A bean from the container...");
		A a1 = (A) ctx.getBean("a");
		if(a1.hasB())
			System.out.println("A has B bean");
		else
			System.out.println("A doesn't have B bean");
		
		System.out.println("Requesting A bean again from the container...");
		A a2 = (A) ctx.getBean("a");
		if(a1 == a2)
			System.out.println("Both A are same beans.");
		else
			System.out.println("Both A are different beans");
		
	}
}
