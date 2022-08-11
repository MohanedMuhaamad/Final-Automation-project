package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P07_homePage {
    public P07_homePage()
    {
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(className = "button-2 add-to-wishlist-button")
    public WebElement wishlist ;
}
