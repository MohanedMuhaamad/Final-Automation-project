package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P08_homePage {
    public P08_homePage()
    {
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(className = "button-2 add-to-compare-list-button")
    public WebElement comparelist ;
}
