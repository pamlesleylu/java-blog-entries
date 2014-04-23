package com.sy.camel.hello;

import org.apache.camel.builder.RouteBuilder;

public class CamelServiceRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		from("switchyard://HelloService")
			.streamCaching()
			.choice()
				.when(xpath("/request/person").booleanResult())
					.to("bean:person")
				.when(xpath("/request/robot").booleanResult())
					.to("bean:robot");			
	}

}
