package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutAsGuestPage extends Utility {
    By welcomeSignIn = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By registerTab = By.xpath("//button[normalize-space()='Register']");


    public String verifyWelcomeSignIn(){
       return getTextFromElement(welcomeSignIn);
    }
    public void clickOnRegisterTab(){
        clickOnElement(registerTab);
    }


}
