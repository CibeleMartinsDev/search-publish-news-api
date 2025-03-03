package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.NewsMapper;
import org.acme.client.WordpressClient;
import org.acme.dto.DiffBotNewsResponse;
import org.acme.dto.WordpressPostRequest;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.ArrayList;

@ApplicationScoped
public class WordpressService {

    @Inject
    @RestClient
    public WordpressClient wordpressClient;

    @ConfigProperty(name = "myapp.wordpress.auth.token")
    private String auth;

    @ConfigProperty(name = "myapp.wordpress.site")
    private String urlSite;

    public String postNews(ArrayList<DiffBotNewsResponse.Object> diffBotNews){

        try {
            ArrayList<WordpressPostRequest> wordpressPostRequests = NewsMapper.from(diffBotNews);
//            String response = wordpressClient.createPost(auth,  );
            return "Publicação realizada com sucesso! Acesse o seu site agora para vê-las! " + urlSite;
        } catch (Exception e) {
            throw new RuntimeException("Ocorreu um erro ao realizar a publicação. Tente novamente em instantes.");
        }



    }

    public String getPostById() {
        String post = wordpressClient.getPostById(782, auth);
        return post;
    }
}
