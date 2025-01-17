package com.san;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.san.beans.A;
import com.san.beans.B;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(Main.class, args);
		
		A a1 = (A) ctx.getBean("a");
		B b1 = (B) ctx.getBean("b");
		
		A a2 = (A) ctx.getBean("a");
		B b2 = (B) ctx.getBean("b");
		
		if(a1== a2)
			System.out.println("a1, a2 beans are same");
		else
			System.out.println("a1, a2 beans aren't same");
		
		if(b1==b2)
			System.out.println("b1, b2 beans are same");
		else
			System.out.println("b1, b2 beans aren't same");
		/*
		 * Is execution of bean change with bean scope
		 */
		
 		
	}
}
