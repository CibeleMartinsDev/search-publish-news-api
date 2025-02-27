package org.acme.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient(baseUri = "https://api.thenewsapi.com/v1/news/all")
public interface NewsApiClient {

    @GET
    String getNews(
            @QueryParam("api_token") String apiToken,
            @QueryParam("search") String search,
            @QueryParam("language") String country,
            @QueryParam("locale") String locale,
            @QueryParam("limit") int limit
    );
}
