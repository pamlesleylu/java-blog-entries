package com.sy.camel.hello;

import javax.inject.Named;

import org.apache.camel.language.XPath;

@Named("robot")
public class RobotBean {

	public void greet(@XPath("/request/robot/model/text()") String name) {
		System.out.println("Hello, " + name);
	}
}
