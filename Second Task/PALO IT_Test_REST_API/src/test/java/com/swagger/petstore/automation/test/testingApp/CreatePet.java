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
import org.junit.Assert;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import static jdk.nashorn.internal.objects.Global.undefined;

@Component
@SynchronousExecution
public class CreatePet implements BusinessLogicCommand {

    private PetInput petInput;

    @Getter
    private int petId;

    @Getter
    String result;

    @Override
    public void execute() {

        petInput=new PetInput(
                999999999, "Kaiser",
                new Category(1, "Dogs"),
                Arrays.asList("Photo"),
                Arrays.asList(new Tag(0, "Tag New Pet")),
                "available"
        );
        petId = petInput.getId();

        Response response= RestAssured.given()
                .contentType("application/json")
                .body(petInput)
                .when()
                .then()
                .log().ifError()
                .statusCode(200)
                .request().post(CommonsType.URL_PROJECT.getKey() + "pet");

        Assert.assertFalse(response.asString().contains("isError"));
        result= response.asString();
        Assert.assertNotNull(result);

//        instanPet=response.as(Pet.class);
    }
}
