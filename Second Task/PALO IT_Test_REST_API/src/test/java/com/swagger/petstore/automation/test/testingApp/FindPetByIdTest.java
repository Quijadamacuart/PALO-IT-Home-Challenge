package com.swagger.petstore.automation.test.testingApp;

import com.swagger.petstore.automation.test.AbstractTest;
import com.swagger.petstore.automation.test.commons.CommonsType;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class FindPetByIdTest extends AbstractTest {
    @Autowired
    private CreatePet createPet;

    private String petId;
    private String result;

    @Before
    public void createNewPet(){
        createPet.execute();
        String newPetResult= createPet.getResult();
        petId = String.valueOf(createPet.getPetId());
        Assert.assertNotNull(newPetResult);
        Assert.assertNotNull(petId);
        System.out.println("Request Result = "+newPetResult);
    }

    @Test
    public void getPetInfo(){
        Response response= RestAssured.given()
                .contentType("application/json")
                .when()
                .then()
                .log().ifError()
                .statusCode(200)
                .request().get(CommonsType.URL_PROJECT.getKey() + "pet/"+ petId);
        Assert.assertFalse(response.asString().contains("isError"));
        result= response.asString();
        Assert.assertNotNull(result);
        System.out.println("Get Request Result = "+result);
    }
}
