package com.expleo.training;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.expleo.training.PageObjects.logInPageObject;
import org.openqa.selenium.support.PageFactory;

public class AppTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://performance-testing.co.za/Main/login.html";
        String expectedTitle = "Cloud9 Airlines";
        driver.get(baseUrl);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title is: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);

        logInPageObject loginPage = PageFactory.initElements
                (driver,logInPageObject.class );

        loginPage.enterEmail("wsi@netactive.com");
        loginPage.enterPassword("Password");
        Thread.sleep(5000L);
        loginPage.clickSignIn();
    }
}