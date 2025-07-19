package com.fancyname.api.model;

public class FancyNameRequest {
    private String name;
    private String style = "default";
    private String gender = "male";

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getStyle() { return style; }
    public void setStyle(String style) { this.style = style; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
}
