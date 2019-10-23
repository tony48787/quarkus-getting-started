package org.acme.quickstart;

import javax.inject.Inject;
import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.List;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService greetingService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greeting(@PathParam("name") String name) {
        return greetingService.greeting(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @GET
    @Path("/helloJason")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Greeting> helloJason() {
        return greetingService.getGreetingByName("Tony");
    }

    @POST
    @Path("helloJason")
    @Produces(MediaType.APPLICATION_JSON)
    public Response createGreeting(String name) {
        greetingService.createGreeting(name);
        return Response.status(Response.Status.CREATED).entity("201 Created").build();
    }
}