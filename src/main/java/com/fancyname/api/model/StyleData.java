package com.fancyname.api.model;

import java.util.List;

public class StyleData {
    private List<String> maleTitles;
    private List<String> femaleTitles;
    private List<String> suffixes;

    // Getters and Setters
    public List<String> getMaleTitles() {
        return maleTitles;
    }

    public void setMaleTitles(List<String> maleTitles) {
        this.maleTitles = maleTitles;
    }

    public List<String> getFemaleTitles() {
        return femaleTitles;
    }

    public void setFemaleTitles(List<String> femaleTitles) {
        this.femaleTitles = femaleTitles;
    }

    public List<String> getSuffixes() {
        return suffixes;
    }

    public void setSuffixes(List<String> suffixes) {
        this.suffixes = suffixes;
    }
}
