package com.sy.camel.hello;

import javax.inject.Named;

import org.apache.camel.language.XPath;

@Named("person")
public class PersonBean {
	
	public void greet(@XPath("/request/person/name/text()") String name) {
		System.out.println("Hello, " + name);
	}

}
