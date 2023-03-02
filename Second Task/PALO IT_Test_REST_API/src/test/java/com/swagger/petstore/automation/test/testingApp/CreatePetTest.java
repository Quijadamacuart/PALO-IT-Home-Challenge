package com.swagger.petstore.automation.test.testingApp;

import com.swagger.petstore.automation.test.AbstractTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CreatePetTest extends AbstractTest {

    @Autowired
    private CreatePet createPet;

    @Test
    public void createNewPet(){
        createPet.execute();
        String petResult= createPet.getResult();
        Assert.assertNotNull(petResult);
        System.out.println("Request Result = "+petResult);
    }
}
