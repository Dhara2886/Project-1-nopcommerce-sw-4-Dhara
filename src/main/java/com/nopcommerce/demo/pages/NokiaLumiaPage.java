package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumiaPage extends Utility {

    By textNokiaLumia = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By price$349 = By.xpath("//span[@id='price-value-20']");
    By changeQty = By.xpath("(//input[@id='product_enteredQuantity_20'])[1]");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By greenBarMessage = By.xpath("//p[@class='content']");
    By closeGreenBar = By.xpath("//span[@title='Close']");
    By mouseHoverToCart = By.xpath("//span[@class='cart-label']");
    By goToCart = By.xpath("//button[normalize-space()='Go to cart']");

    public void verifyTextNokiaLumia(){
        getTextFromElement(textNokiaLumia);
    }
    public void verifyPrice$349(){
        getTextFromElement(price$349);
    }
    public void changeQtyTo2(String ChangeQty){
         sendTextToElement(changeQty, ChangeQty);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String verifyGreenBarMessage(){
       return getTextFromElement(greenBarMessage);
    }
    public void clickCloseGreenBar(){
        clickOnElement(closeGreenBar);
    }
    public void setMouseHoverToCart(){
        mouseHoverToElement(mouseHoverToCart);
    }
    public void clickGoToCart(){
        mouseHoverToElementAndClick(goToCart);
    }

}
