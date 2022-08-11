package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = null;

    @Before
    public static void open_browser()
    {
        //1- Set System Property//
        System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\IdeaProjects\\Final project\\src\\main\\resources\\chromedriver.exe");

        // 2- Create new object from webdriver
        driver = new ChromeDriver();

        // 3- Configurations
        // 3.1 maximize window
        driver.manage().window().maximize();
        // 3.2 implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 4- Navigate to url
        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @After
    public static void quit_browser() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
}
