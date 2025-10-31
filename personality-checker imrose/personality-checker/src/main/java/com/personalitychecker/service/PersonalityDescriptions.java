package com.personalitychecker.service;

import java.util.HashMap;
import java.util.Map;

public class PersonalityDescriptions {

    private static final Map<String, String> descriptions = new HashMap<>();
    private static final Map<String, String> images = new HashMap<>();

    static {
        // Fill descriptions for all 16 MBTI types
        descriptions.put("INTJ", "Strategic, logical, and independent thinker.");
        descriptions.put("INTP", "Innovative, curious, and analytical.");
        descriptions.put("ENTJ", "Natural leader, decisive and efficient.");
        descriptions.put("ENTP", "Energetic, clever, and charismatic.");
        descriptions.put("INFJ", "Insightful, inspiring, and altruistic.");
        descriptions.put("INFP", "Idealistic, loyal, and empathetic.");
        descriptions.put("ENFJ", "Warm, persuasive, and charismatic.");
        descriptions.put("ENFP", "Enthusiastic, creative, and sociable.");
        descriptions.put("ISTJ", "Responsible, organized, and dependable.");
        descriptions.put("ISFJ", "Supportive, caring, and detail-oriented.");
        descriptions.put("ESTJ", "Practical, assertive, and leader.");
        descriptions.put("ESFJ", "Friendly, conscientious, and cooperative.");
        descriptions.put("ISTP", "Flexible, pragmatic, and curious.");
        descriptions.put("ISFP", "Gentle, sensitive, and artistic.");
        descriptions.put("ESTP", "Energetic, perceptive, and spontaneous.");
        descriptions.put("ESFP", "Playful, outgoing, and enthusiastic.");

        // Example image URLs (replace with your own or public images)
        images.put("INTJ", "https://example.com/images/INTJ.png");
        images.put("INTP", "https://example.com/images/INTP.png");
        images.put("ENTJ", "https://example.com/images/ENTJ.png");
        images.put("ENTP", "https://example.com/images/ENTP.png");
        images.put("INFJ", "https://example.com/images/INFJ.png");
        images.put("INFP", "https://example.com/images/INFP.png");
        images.put("ENFJ", "https://example.com/images/ENFJ.png");
        images.put("ENFP", "https://example.com/images/ENFP.png");
        images.put("ISTJ", "https://example.com/images/ISTJ.png");
        images.put("ISFJ", "https://example.com/images/ISFJ.png");
        images.put("ESTJ", "https://example.com/images/ESTJ.png");
        images.put("ESFJ", "https://example.com/images/ESFJ.png");
        images.put("ISTP", "https://example.com/images/ISTP.png");
        images.put("ISFP", "https://example.com/images/ISFP.png");
        images.put("ESTP", "https://example.com/images/ESTP.png");
        images.put("ESFP", "https://example.com/images/ESFP.png");
    }

    public static String getDescription(String type) {
        return descriptions.getOrDefault(type, "Description not available.");
    }

    public static String getImageUrl(String type) {
        return images.getOrDefault(type, "https://example.com/images/default.png");
    }
}
