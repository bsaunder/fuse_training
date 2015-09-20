package net.bryansaunders.fuse_training.enablement;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * A bean which we use in the route
 */
@Path("/hello")
public class HelloService {

    @GET
    @Path("/{name}/")
    public String hello(@PathParam("name") String name) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Hello Method");
        return "Hello " + name + " at " + sdf.format(new Date());
    }
}
