package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {
    By buildYourOwnComputerText = By.xpath("//h1[text()='Build your own computer']");
    By hddOption = By.id("product_attribute_3_7");
    By oSOption = By.id("product_attribute_4_9");
    By officeOption = By.id("product_attribute_5_10");
    By commanderOption = By.id("product_attribute_5_12");
    By price$1475 = By.id("price-value-1");
    By addToCart = By.id("add-to-cart-button-1");
    By greenBarMessage = By.xpath("//div[@class='bar-notification success']");
    By closeGreenBar = By.xpath("//span[@title='Close']");
    By mouseHover = By.xpath("//span[@class='cart-label']");
    By shoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");
    By changeQty = By.id("quantity-up-11231");
    By verifyTotal = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By checkBox = By.xpath("//input[@id='termsofservice']");
    By checkOut = By.xpath("//button[@id='checkout']");
    By welcomeSign = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By guestCheckout = By.xpath("//button[normalize-space()='Checkout as Guest']");


     public String getBuildYourOwnComputerText() {
        return getTextFromElement(buildYourOwnComputerText);
    }
    public void clickHddOption2(){
         clickOnElement(hddOption);
    }
    public void clickOsOption2(){
         clickOnElement(oSOption);
    }
    public void clickOfficeOption(){
         clickOnElement(officeOption);
    }
    public void clickCommanderOption(){
         clickOnElement(commanderOption);
    }
    public String verifyPrice$1475(){
         return getTextFromElement(price$1475);
    }
    public void clickAddToCart(){
         clickOnElement(addToCart);
    }
    public String verifyGreenBarMessage(){
        return getTextFromElement(greenBarMessage);
    }
    public void clickCloseGreenBar(){
         clickOnElement(closeGreenBar);
    }
    public void mouseHoverCart(){
        mouseHoverToElement(mouseHover);
    }
    public String verifyShoppingCart(){
        return getTextFromElement(shoppingCart);
    }
    public void setChangeQty(){
         clickOnElement(changeQty);
    }
    public String verifyTotal2950(){
        return getTextFromElement(verifyTotal);
    }
    public void clickCheckBox(){
         clickOnElement(checkBox);
    }
    public void clickCheckOut(){
         clickOnElement(checkOut);
    }
    public String verifyWelcomeSign(){
        return getTextFromElement(welcomeSign);
    }
    public void clickGuestCheckout(){
         clickOnElement(guestCheckout);
    }

}
