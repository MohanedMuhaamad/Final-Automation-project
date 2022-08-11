package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class D05_hoverCategoriesStepDef {
    @Given("user can change categories")
    public void categories()

    {

        Hooks.driver.findElement(By.className("sublist-toggle")).click();
        Hooks.driver.findElement(By.className("inactive")).click();

    }

}
