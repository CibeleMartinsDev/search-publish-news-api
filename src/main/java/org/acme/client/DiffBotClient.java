package org.acme.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "https://api.diffbot.com/v3/article")
public interface DiffBotClient {

    @GET
    String getContentNews(
            @QueryParam("token") String apiToken,
            @QueryParam("url") String url,
            @QueryParam("timeout") String timeout
    );
}
