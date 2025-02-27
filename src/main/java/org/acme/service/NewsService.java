package org.acme.service;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
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

    public String getNews() {
        String search = "Santa Fé,Paraná";
        int limit = 3;

        // Fazendo a chamada para a API de notícias
        return newsApiClient.getNews(apiToken,  search,"pt","br", limit);
    }

    public void publishNews() {
        //receber o 6 tipos de busca

        //buscar 6 noticias

        //pegar a url de cada uma

        //extrair o conteúdo das 6 noticias

        //criar um post wordpress p/ cada notícia

        //passar o conteúdo da notícia p/ post wordpress

        //publicar
    }
}