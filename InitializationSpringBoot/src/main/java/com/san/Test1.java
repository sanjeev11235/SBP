package com.san;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Test1 {

	public Test1() {
		super();
		System.out.println("Test1 constructor is invoked.");
	}

}
