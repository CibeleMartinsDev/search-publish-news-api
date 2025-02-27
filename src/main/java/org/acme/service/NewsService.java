package org.acme.service;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.acme.client.NewsApiClient;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.io.IOException;


@ApplicationScoped
public class NewsService {
    @Inject
    @RestClient
    NewsApiClient newsApiClient;

    @ConfigProperty(name = "myapp.thenews.api.key")
    String apiToken;

    @GET
    public String getNews() {
        String search = "Santa Fé,Paraná";
        int limit = 3;

        // Fazendo a chamada para a API de notícias
        return newsApiClient.getNews(apiToken,  search,"pt","br", limit);
    }
}