package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_homePage {
    public P04_homePage()
    {
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(className = "small-searchterms")
    public WebElement search ;
}
