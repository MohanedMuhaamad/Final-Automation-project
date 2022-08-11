package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D08_comparelistStepDef {
    @Given("users could add different items in compare list")
    public void comparelist()
    {
     Hooks.driver.findElement(By.className("button-2 add-to-compare-list-button")).click();

        String expectedResult = "The product has been added to your product comparison";
        String actualResult = Hooks.driver.findElement(By.className("The product has been added to your product comparison")).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

    }
}
