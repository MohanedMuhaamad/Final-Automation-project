package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D01_registerStepDef {

    @Given("user go to register page")
    public void register_page()
    {
        // 1- Click on register button
        Hooks.driver.findElement(By.className("ico-register")).click();
        // 2- gender radio button
        Hooks.driver.findElement(By.id("gender-male")).click();
        // 3- first name filed
        Hooks.driver.findElement(By.id("FirstName")).sendKeys("automation");
        // 4- last name filed
        Hooks.driver.findElement(By.id("LastName")).sendKeys("tester");
        // 5- date of birth filed
//      Hooks.driver.findElement(By.className("valid")).click();
        // 6- e-mail filed
        Hooks.driver.findElement(By.id("Email")).sendKeys("test@example.com");
        // 7- company name filed
        Hooks.driver.findElement(By.name("Company")).sendKeys("Udacity");
        // 8- password and confirmation password filed
        Hooks.driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("P@ssw0rd");
        // 9- click on register and register successfully
        Hooks.driver.findElement(By.id("register-button")).click();
        // 10- Assertion
        String expectedResult = "Your registration completed";
        String actualResult = Hooks.driver.findElement(By.className("Your registration completed")).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }


}
