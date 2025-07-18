package com.fancyname.api.model;

public class FancyNameResponse {
    private String input;
    private String fancyName;

    public FancyNameResponse() {}

    public FancyNameResponse(String input, String fancyName) {
        this.input = input;
        this.fancyName = fancyName;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getFancyName() {
        return fancyName;
    }

    public void setFancyName(String fancyName) {
        this.fancyName = fancyName;
    }
}
