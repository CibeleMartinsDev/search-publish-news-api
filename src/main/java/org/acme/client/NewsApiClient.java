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
            @QueryParam("locale") String locale,
            @QueryParam("limit") int limit,
            @QueryParam("search_fields") String searchFields,
            @QueryParam("categories") String categories,
            @QueryParam("exclude_categories") String excludeCategories,
            @QueryParam("domains") String domains,
            @QueryParam("exclude_domains") String excludeDomains,
            @QueryParam("source_ids") String sourceIds,
            @QueryParam("exclude_source_ids") String excludeSourceIds,
            @QueryParam("language") String language,
            @QueryParam("published_before") String publishedBefore,
            @QueryParam("published_after") String publishedAfter,
            @QueryParam("published_on") String publishedOn,
            @QueryParam("sort") String sort,
            @QueryParam("page") Integer page
    );
}
