package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CompletedPage extends Utility {
    By getThankYou = By.xpath("//h1[normalize-space()='Thank you']");
    By getSuccessfullyProcessed = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By clickContinue3 = By.xpath("//button[normalize-space()='Continue']");

    public String verifyThankYouMessage(){
       return getTextFromElement(getThankYou);
    }
    public String verifySuccessfullyProcessed(){
        return getTextFromElement(getSuccessfullyProcessed);
    }
    public void clickOnContinueTab3(){
        clickOnElement(clickContinue3);
    }
}
