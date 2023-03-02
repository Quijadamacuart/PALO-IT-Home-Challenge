package com.swagger.petstore.automation.test.input;

import lombok.Data;

@Data
public class TagInput {

    private int id;
    private String name;

    public TagInput(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
