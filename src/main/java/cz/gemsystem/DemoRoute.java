package cz.gemsystem;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.ContextName;

import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Startup
@ContextName(Constants.CAMEL_CONTEXT_NAME)
public class DemoRoute extends RouteBuilder {

	public void configure() throws Exception {
		from("direct:start")
				.routeId("DemoRoute")
				.log("Hello World!")
				.end();
	}
}
