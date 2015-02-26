package server;

import org.restlet.Component;
import org.restlet.Context;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import org.restlet.routing.Router;

public class CuteLittleServer extends ServerResource {

    public static void main(String[] args) throws Exception {
    	Component component = new Component();
        component.getServers().add(Protocol.HTTP, 8183);

        Context context = new Context();
        
        Router router = new Router(context.createChildContext());
		router.attach("/tests", TestResource.class);
		router.attach("/tests/{test}", TestResource.class);

		component.getDefaultHost().attach(router);
        component.start();
    }

    @Get
    @Override
    public String toString() {
        return "hello, world";
    }

}