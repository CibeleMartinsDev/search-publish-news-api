package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.client.WordpressAuthClient;
import org.acme.client.WordpressClient;
import org.acme.dto.WordpressAuthRequest;
import org.acme.rest.WordpressResource;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class WordpressService {
//
//    @Inject
//    @RestClient
//    public WordpressAuthClient wordpressAuthClient;

    @Inject
    @RestClient
    public WordpressClient wordpressClient;

    @ConfigProperty(name = "myapp.wordpress.auth.token")
    private String authorization;
//
//    public String getAuthorization(WordpressAuthRequest authRequest){
//        String authorization = wordpressAuthClient.getAuthorization();
//    }

    public String getPostById(){
        String post = wordpressClient.getPostById(782, authorization);
        return post;
    }
}
