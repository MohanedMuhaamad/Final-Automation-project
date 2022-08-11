package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_homePage {
    public P03_homePage()
    {
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(className = "customerCurrency")
    public WebElement currency;
}
