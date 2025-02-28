package org.acme.client;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@Path("/wp-json/wp/v2/posts")
@RegisterRestClient(baseUri = "https://www.diariocerto.com.br")
public interface WordpressClient {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    String createPost(
            @HeaderParam("Authorization") String authorization,  // Header para o Token JWT
            String postBody  // Corpo da requisição JSON
    );

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    String getPostById(
            @PathParam("id") int id,  // ID do post a ser recuperado
            @HeaderParam("Authorization") String authorization   // Passando o token JWT no cabeçalho
    );

}


