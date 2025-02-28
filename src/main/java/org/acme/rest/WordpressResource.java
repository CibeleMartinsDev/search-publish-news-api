package org.acme.rest;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.client.WordpressClient;
import org.acme.dto.WordpressAuthRequest;
import org.acme.service.WordpressService;

@Path("/api/v1/wp")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class WordpressResource {

    @Inject
    WordpressService wordpressService;

    @POST
    public Response postAuthorization(WordpressAuthRequest authRequest){

        return Response.ok().build();
    }

    @GET
    public Response getPostById(){
        String post = wordpressService.getPostById();
        return Response.ok(post).build();
    }

}
