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

    public String generateFancyName(String name, String style) {
    switch (style.toLowerCase()) {
        case "pirate":
            return generatePirateName(name);
        case "sci-fi":
            return generateSciFiName(name);
        case "medieval":
            return generateMedievalName(name);
        case "default":
        default:
            return generateDefaultName(name);
    }
}

private String generateDefaultName(String name) {
    String[] titles = { "Sir", "Duke", "Count", "Captain", "Baron", "Wizard" };
    String[] suffixes = {
        "the Java Whisperer", "of the Cloud", "Destroyer of Bugs", "the Immutable", "the Groovy"
    };
    return format(name, titles, suffixes);
}

private String generatePirateName(String name) {
    String[] titles = { "Cap'n", "First Mate", "Buccaneer", "Jolly" };
    String[] suffixes = {
        "the Salty Beard", "of the Seven Seas", "Rum Raider", "Hook Hand", "Barnacle Brain"
    };
    return format(name, titles, suffixes);
}

private String generateSciFiName(String name) {
    String[] titles = { "Commander", "X-", "Neo", "Agent" };
    String[] suffixes = {
        "from Andromeda", "the Cyborg", "Protocol 42", "the Quantum Coder", "of Starbase Null"
    };
    return format(name, titles, suffixes);
}

private String generateMedievalName(String name) {
    String[] titles = { "Sir", "Lady", "Knight", "Warlord" };
    String[] suffixes = {
        "the Valiant", "the Swiftblade", "Ironheart", "of the Kingdom", "the Dragon Tamer"
    };
    return format(name, titles, suffixes);
}

private String format(String name, String[] titles, String[] suffixes) {
    String title = titles[rand.nextInt(titles.length)];
    String suffix = suffixes[rand.nextInt(suffixes.length)];
    return String.format("%s %s %s", title, name, suffix);
}

}
