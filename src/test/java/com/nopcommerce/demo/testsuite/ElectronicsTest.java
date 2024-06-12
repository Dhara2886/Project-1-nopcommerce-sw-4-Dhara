package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    HomePage homePage = new HomePage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    CartPage cartPage = new CartPage();
    CheckoutAsGuestPage checkoutAsGuestPage = new CheckoutAsGuestPage();
    RegisterPage registerPage = new RegisterPage();
    BillingPage billingPage = new BillingPage();
    CompletedPage completedPage = new CompletedPage();

    //1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        // 1.1 Mouse Hover on “Electronics” Tab
        homePage.setMouseHoverElectronics();
        // 1.2 Mouse Hover on “Cell phones” and click
        homePage.setMouseHoverCellPhones();
        // 1.3 Verify the text “Cell phones”
        cellPhonesPage.verifyCellPhonesText();
    }
    // 2. Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully(){
        // 1.1 Mouse Hover on “Electronics” Tab
        homePage.setMouseHoverElectronics();
        // 1.2 Mouse Hover on “Cell phones” and click
        homePage.setMouseHoverCellPhones();
        // 1.3 Verify the text “Cell phones”
        cellPhonesPage.verifyCellPhonesText();
        // 2.4 Click on List View Tab
        cellPhonesPage.clickOnListView();
        // 2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonesPage.clickOnNokiaLumia1020();
        // 2.6 Verify the text “Nokia Lumia 1020”
        nokiaLumiaPage.verifyTextNokiaLumia();
        // 2.7 Verify the price “$349.00”
        nokiaLumiaPage.verifyPrice$349();
        // 2.8 Change quantity to 2
        nokiaLumiaPage.changeQtyTo2("2");
        // 2.9 Click on “ADD TO CART” tab
        nokiaLumiaPage.clickOnAddToCart();
        // 2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedGreenBar = "The product has been added to your shopping cart";
        String actualGreenBar = nokiaLumiaPage.verifyGreenBarMessage();
        Assert.assertEquals(actualGreenBar, expectedGreenBar, "The product has been added to your shopping cart");
        // After that close the bar clicking on the cross button.
        nokiaLumiaPage.clickCloseGreenBar();
        // 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumiaPage.setMouseHoverToCart();
        nokiaLumiaPage.clickGoToCart();
        // 2.12 Verify the message "Shopping cart"
        String expectedTitle = "Shopping cart";
        String actualTitle = cartPage.verifyShoppingCart();
        Assert.assertEquals(actualTitle, expectedTitle, "Shopping cart");
        // 2.13 Verify the quantity is 2
        String expectedQty = "2";
        String actualQty = cartPage.verifyQty();
        Assert.assertEquals(actualQty, expectedQty, "2");
        // 2.14 Verify the Total $698.00
        String expectedTotal = "$698.00";
        String actualTotal = cartPage.verifyTotal();
        Assert.assertEquals(actualTotal, expectedTotal, "$698.00");
        // 2.15 click on checkbox “I agree with the terms of service”
        cartPage.clickOnCheckbox();
        // 2.16 Click on “CHECKOUT”
        cartPage.clickOnCheckout();
        // 2.17 Verify the Text “Welcome, Please Sign In!”
        String expectedSign = "Welcome, Sign In!";
        String actualSign = checkoutAsGuestPage.verifyWelcomeSignIn();
        Assert.assertEquals(actualSign, expectedSign, "Welcome, Sign In!");
        // 2.18 Click on “REGISTER” tab
        checkoutAsGuestPage.clickOnRegisterTab();
        // 2.19 Verify the text “Register”
        String expectedText1 = "Register";
        String actualText1 = registerPage.verifyRegisterText();
        Assert.assertEquals(actualText1, expectedText1, "Register");
        // 2.20 Fill the mandatory fields
        registerPage.setFirstName("Dhara");
        registerPage.setLastName("Patel");
        registerPage.setEmailId("dhara@gmail.com");
        registerPage.setPasswordField("Dhara123");
        registerPage.setConfirmPassword("Dhara123");
        // 2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterTab();
        // 2.22 Verify the message “Your registration completed”
        registerPage.verifyRegisterText();
        // 2.23 Click on “CONTINUE” tab
        registerPage.clickOnContinueTab();
        // 2.24 Verify the text “Shopping card”
        cartPage.verifyShoppingCart();
        // 2.25 click on checkbox “I agree with the terms of service”.
        cartPage.clickOnCheckbox();
        // 2.26 Click on “CHECKOUT”
        cartPage.clickOnCheckout();
        // 2.27 Fill the Mandatory fields
        billingPage.enterFirstName("Dhara");
        billingPage.lastNameField("Patel");
        billingPage.emailIdField("123@gmail.com");
        billingPage.countryId("456");
        billingPage.cityName("Hounslow");
        billingPage.address("Hanworth");
        billingPage.postCode("tw13 6rt");
        billingPage.phoneNumber("07525446407");
        // 2.28 Click on “CONTINUE”
        billingPage.clickContinueTab();
        // 2.29 Click on Radio Button “2nd Day Air ($0.00)”
        billingPage.clickOn2ndDayAir();
        // 2.30 Click on “CONTINUE”
        billingPage.clickContinueTab1();
        // 2.31 Select Radio Button “Credit Card”
        billingPage.clickRadioTab1();
        // 2.32 Select “Visa” From Select credit card dropdown
        WebElement dropdown = driver.findElement(By.xpath("//option[contains(text(),'Visa')]"));
        Select select = new Select(dropdown);
        select.selectByIndex(0);
        // 2.33 Fill all the details
        billingPage.enterCardholderName("Dhara Patel");
        billingPage.enterCardNumber("4111 1111 1111 1111");
        WebElement expirymonthdropdown = driver.findElement(By.xpath("//select[@id='ExpireMonth']"));
        Select select3 = new Select(expirymonthdropdown);
        select3.selectByValue("3");
        WebElement expiryyeardropdown = driver.findElement(By.xpath("//select[@id='ExpireYear']"));
        Select select4 = new Select(expiryyeardropdown);
        select4.selectByValue("2025");
        billingPage.enterCardCode("111");
        // 2.34 Click on “CONTINUE”
        billingPage.clickContinueTab3();
        // 2.35 Verify “Payment Method” is “Credit Card”
        String expectedPaymentMethod = "Credit Card";
        String actualPaymentMethod = billingPage.verifyPaymentMethod();
        Assert.assertEquals(actualPaymentMethod,expectedPaymentMethod,"Credit Card");
        // 2.36 Verify “Shipping Method” is “2nd Day Air”
        String expectedShippingMethod = "2nd Day Air";
        String actualShippingMethod = billingPage.verifyShippingMethod1();
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod, "2nd Day Air");
        // 2.37 Verify Total is “$698.00”
        String expectedTotal698 = "$698.00";
        String actualTotal698 = billingPage.verifyTotal698();
        Assert.assertEquals(actualTotal698, expectedTotal698, "$698.00");
        // 2.38 Click on “CONFIRM”
        billingPage.clickOnConfirmTab();
        // 2.39 Verify the Text “Thank You”
        String expectedText = "Thank You";
        String actualText = completedPage.verifyThankYouMessage();
        Assert.assertEquals(actualText, expectedText, "Thank You");
        // 2.40 Verify the message “Your order has been successfully processed!”
        String expectedMessage3 = "Your order has been successfully processed!";
        String actualMessage3 = completedPage.verifySuccessfullyProcessed();
        Assert.assertEquals(actualMessage3,expectedMessage3, "Your order has been successfully processed!");
        // 2.41 Click on “CONTINUE”
        completedPage.clickOnContinueTab3();
        // 2.42 Verify the text “Welcome to our store”
        String expectedWelcome = "Welcome to our store";
        String actualWelcome = homePage.verifyWelcomeToStoreSign();
        Assert.assertEquals(actualWelcome, expectedWelcome, "Welcome to our store");
        //2.43 Click on “Logout” link
        homePage.clickOnLogoutTab();
        // 2.44 Verify the URL is “https://demo.nopcommerce.com/”
        expectedText = "https://demo.nopcommerce.com/";
        actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, expectedText);


    }


}
