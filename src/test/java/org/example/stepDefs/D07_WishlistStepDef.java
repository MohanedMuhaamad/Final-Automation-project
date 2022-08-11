package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D07_WishlistStepDef {
    @Given("users could add different items in wishlist")
    public void wishlist ()
    {
        Hooks.driver.findElement(By.className("button-2 add-to-wishlist-button")).click();
        String expectedResult = "The product has been added to your wishlist";
        String actualResult = Hooks.driver.findElement(By.className("The product has been added to your wishlist")).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

    }
}
