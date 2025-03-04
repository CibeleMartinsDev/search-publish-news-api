package org.acme.dto;

import java.util.ArrayList;

public class PostNewsRequest {
    public ArrayList<DiffBotNewsResponse.Object> diffBotNewsResponses;

    public ArrayList<DiffBotNewsResponse.Object> getDiffBotNewsResponses() {
        return diffBotNewsResponses;
    }

    public void setDiffBotNewsResponses(ArrayList<DiffBotNewsResponse.Object> diffBotNewsResponses) {
        this.diffBotNewsResponses = diffBotNewsResponses;
    }
}
