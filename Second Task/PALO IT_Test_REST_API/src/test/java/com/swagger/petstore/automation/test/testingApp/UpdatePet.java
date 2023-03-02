package com.swagger.petstore.automation.test.testingApp;

import com.jatun.open.tools.blcmd.annotations.SynchronousExecution;
import com.jatun.open.tools.blcmd.core.BusinessLogicCommand;
import com.swagger.petstore.automation.test.commons.CommonsType;
import com.swagger.petstore.automation.test.input.PetInput;
import com.swagger.petstore.automation.test.model.Category;
import com.swagger.petstore.automation.test.model.Tag;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;
import org.junit.Assert;

import java.util.Arrays;

@SynchronousExecution
public class UpdatePet implements BusinessLogicCommand {
    private PetInput petInput;

    @Getter
    private String result;

    @Override
    public void execute() {
        petInput=new PetInput(
                101,
                "Donald",
                new Category(20, "Duck"),
                Arrays.asList("Photo"),
                Arrays.asList(new Tag(0, "Tag New Duck")),
                "available"
        );

        Response response= RestAssured.given()
                .contentType("application/json")
                .body(petInput)
                .when()
                .then()
                .log().ifError()
                .statusCode(200)
                .request().put(CommonsType.URL_PROJECT.getKey() + "pet");

        Assert.assertFalse(response.asString().contains("isError"));
        result= response.asString();
        Assert.assertNotNull(result);
    }
}
