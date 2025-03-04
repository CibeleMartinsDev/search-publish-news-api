package org.acme.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.client.DiffBotClient;
import org.acme.client.NewsApiClient;
import org.acme.dto.DiffBotNewsRequest;
import org.acme.dto.DiffBotNewsResponse;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.ArrayList;


@ApplicationScoped
public class NewsService {
    @Inject
    @RestClient
    NewsApiClient newsApiClient;

    @ConfigProperty(name = "myapp.thenews.api.key")
    String apiToken;

    @Inject
    @RestClient
    DiffBotClient diffBotClient;

    @ConfigProperty(name = "myapp.diffbot.api.key")
    String apiDiffbotToken;


    public String getNews(String search,
                          String locale,
                          int limit,
                          String searchFields,
                          String categories,
                          String excludeCategories,
                          String domains,
                          String excludeDomains,
                          String sourceIds,
                          String excludeSourceIds,
                          String language,
                          String publishedBefore,
                          String publishedAfter,
                          String publishedOn,
                          String sort,
                          Integer page) throws Exception {
        try {
            // Fazendo a chamada para a API de notícias
            return newsApiClient.getNews(apiToken, search, locale, limit,
                    searchFields, categories, excludeCategories, domains,
                    excludeDomains, sourceIds, excludeSourceIds, language,
                    publishedBefore, publishedAfter, publishedOn, sort, page);
        } catch (Exception e) {
            throw new Exception("Erro pesquisar as notícias. Tente novamente em instantes.");
        }

    }

    public ArrayList<DiffBotNewsResponse.Object> getContentNews(String urls) throws Exception {
        try {
            ArrayList<DiffBotNewsResponse.Object> result = new ArrayList<>();
            for (String url : urls.split(",")) {
                url.replace("/", "\\/");
                String response = diffBotClient.getContentNews(apiDiffbotToken, url, "5000");
                ObjectMapper objectMapper = new ObjectMapper();
                DiffBotNewsResponse diffBotNewsResponse = objectMapper.readValue(response, DiffBotNewsResponse.class);
                if(diffBotNewsResponse.getObjects() != null){
                    result.addAll(diffBotNewsResponse.getObjects());
                }
            }
            return result;
        } catch (Exception e) {
            throw new Exception("Erro ao extrair o conteúdo das notícias. Tente novamente em instantes.");
        }
    }

}