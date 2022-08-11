package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class D04_searchStepDef {
    @Given("user Click search button")
    public void search()
    {
        Hooks.driver.findElement(By.id("small-searchterms")).click();
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
        Hooks.driver.findElement(By.className("master-wrapper-page")).click();

    }
}
