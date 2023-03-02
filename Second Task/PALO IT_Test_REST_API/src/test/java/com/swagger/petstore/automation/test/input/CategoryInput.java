package com.swagger.petstore.automation.test.input;

import lombok.Data;

@Data
public class CategoryInput {

    private int id;
    private String name;

    public CategoryInput(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
