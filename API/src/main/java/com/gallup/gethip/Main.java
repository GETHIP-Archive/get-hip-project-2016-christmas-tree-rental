//Package Declaration
package com.gallup.gethip;
//Import Jersey/Maven/HTTP stuff
import com.gallup.gethip.model.Decoration;
import com.gallup.gethip.model.Cart;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.sun.jersey.api.container.grizzly2.GrizzlyServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import org.glassfish.grizzly.http.server.HttpServer;
//Import finer Jersey / SQL functions
import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;
import java.sql.SQLException;
public class Main {
    private static int getPort(int defaultPort) {
        String httpPort = System.getProperty("jersey.test.port");
        if (null != httpPort) {
            try {
	    	int outport = Integer.parseInt(httpPort);
		System.out.println("Success: Retrieved jersey HTTP port (" + outport + ")");
                return outport;
            } catch (NumberFormatException e) {
	    	System.err.println("Failed. Incorrect number format: " + e);
            }
        }
        return defaultPort;
    }
    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost/").port(getPort(9998)).build();
    }
    public static final URI BASE_URI = getBaseURI();
    protected static HttpServer startServer() throws IOException {
        ResourceConfig resourceConfig = new PackagesResourceConfig("com.gallup.gethip.resources");
        System.out.println("Starting HTTP Server");
        return GrizzlyServerFactory.createHttpServer(BASE_URI, resourceConfig);
    }
    public static void main(String[] args) throws IOException {
        HttpServer httpServer = startServer();
	System.in.read();
	httpServer.stop();
    }    
}
