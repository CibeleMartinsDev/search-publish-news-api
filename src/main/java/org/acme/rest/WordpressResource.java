package org.acme.rest;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.dto.PostNewsRequest;
import org.acme.service.WordpressService;

@Path("/api/v1/wp")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class WordpressResource {

    @Inject
    WordpressService wordpressService;


    @GET
    public Response getPostById() {
        String post = wordpressService.getPostById();
        return Response.ok(post).build();
    }

    ;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postNews(PostNewsRequest postNewsRequest) {
        String response = wordpressService.postNews(postNewsRequest.getDiffBotNewsResponses());
        return Response.ok(response).build();
    }

    ;

}
