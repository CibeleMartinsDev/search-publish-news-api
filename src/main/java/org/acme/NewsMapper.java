package org.acme;

import org.acme.dto.DiffBotNewsResponse;
import org.acme.dto.WordpressPostRequest;

import java.util.ArrayList;

public class NewsMapper {

    public static ArrayList<WordpressPostRequest> from(ArrayList<DiffBotNewsResponse.Object> diffBotNewsResponses) {
        ArrayList<WordpressPostRequest> wordpressPosts = new ArrayList<>();

        for (DiffBotNewsResponse.Object diffBotNews : diffBotNewsResponses){
            WordpressPostRequest wpPost = new WordpressPostRequest();
            //titulo noticia
            wpPost.setTitle(diffBotNews.getTitle());
            // conteudo noticia
            wpPost.setContent(diffBotNews.getHtml());

            //slug

            //link p/ noticia

            // autor da noticia

            // fonte da noticia

            //categoria (destaque p/ exemplo)

            // colocar capa na noticia

            // colocar data de publicacao da noticia no site wp

            // data de publicacao da noticia referente a fonte dela, de onde foi publicada

            //status = publish (para publicar o post no wp)
        }

        return wordpressPosts;
    }
}
