package com.fancyname.api.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class FancyNameRequest {
    @NotBlank(message = "Name must not be blank")
    private String name;
    @NotBlank(message = "Style must not be blank")
    @Pattern(regexp = "medieval|pirate|sci-fi", message = "Style must be one of: medieval, pirate, sci-fi")
    private String style = "default";
    private String gender = "male";

    // Gette
    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getStyle() { return style; }
    public void setStyle(String style) { this.style = style; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
}
