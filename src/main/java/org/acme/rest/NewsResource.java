package org.acme.rest;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.dto.DiffBotNewsRequest;
import org.acme.dto.DiffBotNewsResponse;
import org.acme.service.NewsService;

import java.io.IOException;
import java.util.ArrayList;

@Path("/api/v1/news")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class NewsResource {

    @Inject
    NewsService newsService;


    @GET
    public Response getNews(@QueryParam("search") String search,
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
                            @QueryParam("page") Integer page) throws Exception {
        // Chama o serviço que vai buscar as notícias
        String news = newsService.getNews(search, locale, limit,
                searchFields, categories, excludeCategories, domains,
                excludeDomains, sourceIds, excludeSourceIds, language,
                publishedBefore, publishedAfter, publishedOn, sort, page
        );
        return Response.status(Response.Status.OK).entity(news).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response extractContentNews(DiffBotNewsRequest diffBotNewsRequest) throws Exception {
        //chama o servico que extrai o conteúdo das noticias
        ArrayList<DiffBotNewsResponse.Object> extractContentNews = newsService.getContentNews(diffBotNewsRequest);
        return Response.ok(extractContentNews).build();
    }
}