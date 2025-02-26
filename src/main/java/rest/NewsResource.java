package rest;


import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
import service.NewsService;

@Path("/news")
public class NewsResource {

    @Inject
    NewsService newsService;

    @GET
    public Response getNews(@QueryParam("apiKey") String apiKey) {
        // Chama o serviço que vai buscar as notícias
        String news = newsService.getNews();
        return Response.ok(news).build();
    }
}