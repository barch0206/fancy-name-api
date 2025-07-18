package com.fancyname.api.service;
import com.fancyname.api.model.StyleData;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import java.util.Random;

@Service
public class FancyNameService {

    @Autowired
private StyleDataLoader styleDataLoader;

    private final Random rand = new Random();

 public String generateFancyName(String name, String style, String gender) {
    return generateFromJsonStyle(name, style, gender);
}

private String generateFromJsonStyle(String name, String style, String gender) {
    StyleData data = styleDataLoader.getStyleData(style.toLowerCase());

    if (data == null) {
        data = styleDataLoader.getStyleData("default");
    }

    List<String> titles = "female".equalsIgnoreCase(gender)
        ? data.getFemaleTitles()
        : data.getMaleTitles();

    List<String> suffixes = data.getSuffixes();

    return format(name, titles.toArray(new String[0]), suffixes.toArray(new String[0]));
}




private String format(String name, String[] titles, String[] suffixes) {
    String title = titles[rand.nextInt(titles.length)];
    String suffix = suffixes[rand.nextInt(suffixes.length)];
    return String.format("%s %s %s", title, name, suffix);
}

}
