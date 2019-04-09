package com.expleo.training.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class logInPageObject {
    private WebElement inputEmail;
    private WebElement inputPassword;
    private WebElement SigninButton;

    // Alternative method for sign in button
    //@FindBy (how = How.XPATH, using = "//*[@id=\"SigninButton\"]")
    //private WebElement SigninButton;

    public void enterEmail(String text){
        inputEmail.clear();
        inputEmail.sendKeys(text);
    }
    public void enterPassword(String text){
        inputPassword.clear();
        inputPassword.sendKeys(text);
    }

    public void clickSignIn(){
        SigninButton.click();
    }
}
