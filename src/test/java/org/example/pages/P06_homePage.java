package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P06_homePage {

    public P06_homePage()
    {
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(className = "button-2 product-box-add-to-cart-button")
    public WebElement shoppingcart ;
}
