package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CartPage extends Utility {
    By shoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");
    By quantity = By.xpath("//input[@id='itemquantity11233']");
    By total = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By checkbox = By.xpath("//input[@id='termsofservice']");
    By checkout = By.xpath("//button[@id='checkout']");

    public String  verifyShoppingCart(){
       return getTextFromElement(shoppingCart);
    }
    public String verifyQty(){
        return getTextFromElement(quantity);
    }
    public String verifyTotal(){
        return getTextFromElement(total);
    }
    public void clickOnCheckbox(){
        clickOnElement(checkbox);
    }
    public void clickOnCheckout(){
        clickOnElement(checkout);
    }
}
