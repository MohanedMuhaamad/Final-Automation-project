package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class D02_loginStepDef {
    @Given("user could login with valid email and password")
    public void valid()
    {
        // 1- click on login button
        Hooks.driver.findElement(By.className("ico-login")).click();
        // 2- enter valid e-mail
        Hooks.driver.findElement(By.id("Email")).sendKeys("test@example.com");
        // 3- enter valid password
        Hooks.driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");
        // 4- click login button
        Hooks.driver.findElement(By.className("button-1 login-button")).click();

    }

    @Given("user could login with invalid email and password")
public void invalid()
{
    // 1- click on login button
    Hooks.driver.findElement(By.className("ico-login")).click();
    // 2- enter valid e-mail
    Hooks.driver.findElement(By.id("Email")).sendKeys("wrong@example.com");
    // 3- enter valid password
    Hooks.driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");
    // 4- click login button
    Hooks.driver.findElement(By.className("button-1 login-button")).click();
}
}
