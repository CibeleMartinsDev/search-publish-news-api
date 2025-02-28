package org.acme.rest;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.dto.DiffBotNewsDTO;
import org.acme.dto.PostNewsRequest;
import org.acme.service.DiffBotService;
import org.acme.service.NewsService;

import java.io.IOException;

@Path("/api/v1/news")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class NewsResource {

    @Inject
    NewsService newsService;

    @Inject
    DiffBotService diffBotService;

    @GET
    public Response getNews() throws IOException {
        // Chama o serviço que vai buscar as notícias
        String news = newsService.getNews();
        DiffBotNewsDTO extractContentNews = diffBotService.getContentNews();
        return Response.status(Response.Status.OK).entity(extractContentNews).build();
    }

//    @POST
//    public Response postNews(PostNewsRequest postNewsRequest) throws IOException {
//        String extractContentNews = diffBotService.getContentNews();
//        return Response.ok(extractContentNews).build();
//    }
}