package com.swagger.petstore.automation.test.commons;

public enum CommonsType {

    URL_PROJECT("http://localhost:8081/api/v3/");

    private String key;
    CommonsType(String key) {
        this.key=key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
