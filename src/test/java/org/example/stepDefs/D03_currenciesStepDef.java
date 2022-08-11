//package org.example.stepDefs;
//
//import io.cucumber.java.en.Given;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//
//public class D03_currenciesStepDef {
//    @Given("user change currency to euro")
//    public String currency () {
//        Hooks.driver.findElement(By.id("customerCurrency")).click();
//
////        WebElement el = currency().change();
////        Select sel = new Select(el);
////
////        WebElement first = sel.getFirstSelectedOption();
////        String currentCurrency = first.getText();
////        System.out.println("Current Currency is : " + currentCurrency );
////
////        if (currentCurrency.contains("US Dollar"))
////            sel.selectByVisibleText("Euro");
////
////        else if (currentCurrency.contains ("Euro"))
////            sel.selectByVisibleText("US Dollar");
////
////        String test = currency();
////        Assert.assertTrue(test.contains("€"),"Incorrect currency");
////        return currentCurrency;
////    }
////
////
////    }
//
