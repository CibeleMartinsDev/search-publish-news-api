package org.acme.client;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@Path("/wp-json/jwt-auth/v1/token")
@RegisterRestClient(baseUri = "https://www.diariocerto.com.br")
public interface WordpressAuthClient {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    String getAuthorization(
            @HeaderParam("Authorization") String authorization,  // Header para o Token JWT
            String postBody  // Corpo da requisição JSON
    );


}
