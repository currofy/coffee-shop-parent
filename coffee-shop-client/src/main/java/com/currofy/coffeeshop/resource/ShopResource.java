package com.currofy.coffeeshop.resource;

import io.quarkus.eureka.client.EurekaClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;

@Path("/info")
public class ShopResource {

    @Inject
    EurekaClient eurekaClient;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        String coffeeSupplier = "coffee-supplier";
        String serverResponse = eurekaClient.app(coffeeSupplier)
                .path("/info")
                .request(MediaType.TEXT_PLAIN)
                .get()
                .readEntity(String.class);
        return String.join(",", "coffee-shop client requested: ", serverResponse);
    }

    @GET
    @Path("/health")
    public Response health() {
        return Response.ok(Collections.singletonMap("STATUS", "UP")).build();
    }

    @GET
    @Path("/status")
    public Response status() {
        return Response.ok(Collections.emptyMap()).build();
    }

}