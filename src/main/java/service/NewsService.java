package service;

import client.BrightDataApiClient;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;


@ApplicationScoped
public class NewsService {

    @Inject
    @RestClient
    BrightDataApiClient brightDataApiClient;

    public String getNews() {
        // Chama o método da API, passando os parâmetros para a requisição
        // Pesquisar por "pizza" com tipo de pesquisa "shop"
        return brightDataApiClient.search("paraná", "nws");
    }
}