package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By registerLink = By.linkText("Register");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By apparelLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
    By digitalDownloadsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
    By booksLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']");
    By jewelryLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");
    By giftCardsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']");
    By welcomeToStore = By.xpath("//h2[normalize-space()='Welcome to our store']");
    By mouseHoverElectronics = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By mouseHoverCellPhones = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By logoutTab = By.xpath("//a[normalize-space()='Log out']");


    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public void clickOnComputersTab(){
        clickOnElement(computersLink);
    }
    public void clickOnElectronicsTab(){
        clickOnElement(electronicsLink);
    }
    public void clickOnApparelTab(){
        clickOnElement(apparelLink);
    }
    public void clickOnDigitalDownloadsTab(){
        clickOnElement(digitalDownloadsLink);
    }
    public void clickOnBooksLink(){
        clickOnElement(booksLink);
    }
    public void clickOnJewelryLink(){
        clickOnElement(jewelryLink);
    }
    public void clickOnGiftCardsLink(){
        clickOnElement(giftCardsLink);
    }
    public String verifyWelcomeToStoreSign(){
        return getTextFromElement(welcomeToStore);
    }
    public void setMouseHoverElectronics(){
        mouseHoverToElement(mouseHoverElectronics);
    }
    public void setMouseHoverCellPhones(){
        mouseHoverToElementAndClick(mouseHoverCellPhones);
    }
    public void clickOnLogoutTab(){
        clickOnElement(logoutTab);
    }

}
