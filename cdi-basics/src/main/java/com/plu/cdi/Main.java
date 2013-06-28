package com.plu.cdi;

import javax.enterprise.inject.Instance;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;


public class Main {
	public static void main(String[] args) {
		WeldContainer container = new Weld().initialize();
		
		Instance<Greeter> greeterInstance = container.instance().select(Greeter.class);
		greeterInstance.get().greet("World");
	}
}
