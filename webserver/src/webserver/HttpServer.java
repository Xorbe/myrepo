package webserver;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.webapp.WebAppContext;

public class HttpServer {

	private Server server;
	private final int PORT = 8080;

	public HttpServer() {
		server = new Server(PORT);
		
		// Handler for multiple web apps
		HandlerCollection handlers = new HandlerCollection();

		// Creating the first web application context
		WebAppContext webapp1 = new WebAppContext();
		webapp1.setResourceBase("root");
		webapp1.setContextPath("/");
		webapp1.setDefaultsDescriptor("webdefault/webdefault.xml");
		handlers.addHandler(webapp1);

		// Adding the handlers to the server
		server.setHandler(handlers);
	}

	public void start() throws Exception {
		server.start();
		server.join();
	}

	public void stop() throws Exception {
		if (server != null) {
			server.stop();
		}
	}
	
	public static void main(String[] args) throws Exception {
		HttpServer server = new HttpServer();
		server.start();
	}

}
