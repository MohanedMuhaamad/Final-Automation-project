package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D06_shoppingcartStepDef {
    @Given("users could add different items in shopping cart")
    public void shoppingcart ()
    {
        Hooks.driver.findElement(By.className("button-2 product-box-add-to-cart-button")).click();

        String expectedResult = "The product has been added to your shopping cart";
        String actualResult = Hooks.driver.findElement(By.className("The product has been added to your shopping cart")).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
