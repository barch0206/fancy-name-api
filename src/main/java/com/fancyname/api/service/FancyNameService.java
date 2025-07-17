package com.fancyname.api.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class FancyNameService {

    private final String[] titles = {
        "Sir", "Duke", "Count", "Captain", "Baron", "Wizard", "Ninja", "Professor", "Lord", "Master"
    };

    private final String[] suffixes = {
        "the Java Whisperer", "of the Cloud", "Destroyer of Bugs", "the Immutable", "the Groovy", "of Kubernetes",
        "the Backend Slayer", "who Codes in Darkness", "with Lightning in Fingers", "the Eternal Debugger"
    };

    private final Random rand = new Random();

    public String generateFancyName(String name) {
        String title = titles[rand.nextInt(titles.length)];
        String suffix = suffixes[rand.nextInt(suffixes.length)];
        return String.format("%s %s %s", title, name, suffix);
    }
}
