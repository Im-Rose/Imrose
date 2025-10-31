package com.personalitychecker.model;

public class PersonalityResult {
    private String type;
    private String description;
    private String imageUrl;

    public PersonalityResult(String type, String description, String imageUrl) {
        this.type = type;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
