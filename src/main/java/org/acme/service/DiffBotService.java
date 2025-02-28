package org.acme.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.client.DiffBotClient;
import org.acme.dto.DiffBotNewsDTO;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.Objects;

@ApplicationScoped
public class DiffBotService {

    @Inject
    @RestClient
    DiffBotClient diffBotClient;

    @ConfigProperty(name = "myapp.diffbot.api.key")
    String configValue;

    public DiffBotNewsDTO getContentNews() throws JsonProcessingException {
        String response =  diffBotClient.getContentNews(configValue, "https://bandnewsfmcuritiba.com/estado-do-parana-tem-alerta-amarelo-de-tempestades/#:~:text=Conforme%20o%20Inmet%2C%20est%C3%A3o%20previstos,galhos%20de%20%C3%A1rvore%20e%20alagamento.", "1000");
       ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.registerSubtypes(DiffBotNewsDTO.Request.class);
//        objectMapper.registerSubtypes(DiffBotNewsDTO.Object.class);
//        objectMapper.registerSubtypes(DiffBotNewsDTO.Category.class);
//        objectMapper.registerSubtypes(DiffBotNewsDTO.Image.class);
       DiffBotNewsDTO result = objectMapper.readValue(response, DiffBotNewsDTO.class);

        return result;
    }
}
