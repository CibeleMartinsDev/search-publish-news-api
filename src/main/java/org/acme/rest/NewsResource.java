package org.acme.rest;


import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
import org.acme.service.DiffBotService;
import org.acme.service.NewsService;

import java.io.IOException;


@Path("/api/v1/news")
public class NewsResource {

    @Inject
    NewsService newsService;

    @Inject
    DiffBotService diffBotService;

    @GET
    public Response getNews() throws IOException {
        // Chama o serviço que vai buscar as notícias
        String news = newsService.getNews();
        String extractContentNews = diffBotService.getContentNews();
        return Response.ok(extractContentNews).build();
    }
}