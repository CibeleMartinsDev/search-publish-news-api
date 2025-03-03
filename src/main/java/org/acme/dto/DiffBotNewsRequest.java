package org.acme.dto;

import java.util.ArrayList;

public class DiffBotNewsRequest {

    public ArrayList<String> urls;

    public ArrayList<String> getUrls() {
        return urls;
    }

    public void setUrls(ArrayList<String> urls) {
        this.urls = urls;
    }
}
