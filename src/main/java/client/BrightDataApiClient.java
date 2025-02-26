package client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;



@RegisterRestClient(configKey = "google-search-api")
@Path("https://www.google.com/search")
public interface BrightDataApiClient {

    @GET
    String search(@QueryParam("q") String query, @QueryParam("tbm") String tbm);
}