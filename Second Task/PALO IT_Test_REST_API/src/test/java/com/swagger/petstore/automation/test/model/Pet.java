package com.swagger.petstore.automation.test.model;

import lombok.Data;

import java.util.List;

@Data
public class Pet {
    private int id;
    private String name;
    private Category category;
    private List<String> photoUrls;
    private List<Tag> tags;
    private String status;

    public Pet(int id, String name, Category category, List<String> photoUrls, List<Tag> tags, String status) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }
}
