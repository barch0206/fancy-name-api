package com.fancyname.api.service;

import com.fancyname.api.model.StyleData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

// import javax.annotation.PostConstruct;
import jakarta.annotation.PostConstruct;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Component
public class StyleDataLoader {

    private final Map<String, StyleData> styles = new HashMap<>();

    @PostConstruct
    public void loadStyles() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String[] styleNames = { "medieval", "pirate", "sci-fi", "default" };

            for (String style : styleNames) {
                InputStream is = getClass().getResourceAsStream("/data/" + style + ".json");
                StyleData data = mapper.readValue(is, StyleData.class);
                styles.put(style, data);
            }

        } catch (Exception e) {
            throw new RuntimeException("Failed to load style data", e);
        }
    }

    public StyleData getStyleData(String style) {
        return styles.get(style);
    }
}
