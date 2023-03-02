package com.swagger.petstore.automation.test.testingApp;

import com.swagger.petstore.automation.test.AbstractTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdatePetTest extends AbstractTest {
    @Autowired
    private CreatePet createPet;

    @Autowired
    private UpdatePet updatePet;

    @Before
    public void createNewPet(){
        createPet.execute();
        String newPetResult= createPet.getResult();
        Assert.assertNotNull(newPetResult);
        System.out.println("Request Result = "+newPetResult);
    }

    @Test
    public void updatePet(){
        updatePet.execute();
        String updateResult = updatePet.getResult();
        Assert.assertNotNull(updateResult);
        System.out.println("Request Result = "+updateResult);
    }
}
