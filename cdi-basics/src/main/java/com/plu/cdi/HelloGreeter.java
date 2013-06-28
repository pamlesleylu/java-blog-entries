package com.plu.cdi;

public class HelloGreeter implements Greeter {

	public void greet(final String who) {
		System.out.printf("Hello, %s!", who);
	}

}
