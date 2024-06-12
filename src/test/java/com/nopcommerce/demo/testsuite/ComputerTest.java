package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComputerTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    BillingPage billingPage = new BillingPage();
    CompletedPage completedPage = new CompletedPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        //1.1 Click on Computer Menu
        homePage.clickOnComputersTab();
        //1.2 Click on Desktop
        computersPage.clickDesktopTab();
        //1.3 Select sort by position "Name: Z to A"
        desktopPage.selectZToA();
        //1.4 Verify the Product will arrange in Descending order.
        List<String> actualList = desktopPage.listProductList();
        System.out.println(actualList);
        List<String> sortedProductNames = new ArrayList<>(actualList);
        sortedProductNames.sort(Comparator.reverseOrder());
        System.out.println(sortedProductNames);
        boolean Sorted = actualList.equals(sortedProductNames);
        Assert.assertFalse(Sorted);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on Computer Menu
        homePage.clickOnComputersTab();
        //2.2 Click on Desktop
        computersPage.clickDesktopTab();
        //2.3 Select sort by position "Name: A to Z"
        desktopPage.selectAToZ();
        // 2.4 Click on "Add To Cart"
        driver.navigate().refresh();
        desktopPage.clickOnAddToCart();
        //2.5 Verify the Text "Build your own computer"
        String expectedMessage = "Build your own computer";
        String actualMessage = buildYourOwnComputerPage.getBuildYourOwnComputerText();
        Assert.assertEquals(actualMessage, expectedMessage, "Build your own computer");
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class.
        WebElement dropdown = driver.findElement(By.id("product_attribute_1"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);
        //2.7.Select "8GB [+$60.00]" using Select class.
        WebElement dropdown1 = driver.findElement(By.id("product_attribute_2"));
        Select select1 = new Select(dropdown1);
        select1.selectByIndex(3);
        // 2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputerPage.clickHddOption2();
        // 2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputerPage.clickOsOption2();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(5000);
        // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        buildYourOwnComputerPage.clickOfficeOption();
        Thread.sleep(5000);
        buildYourOwnComputerPage.clickCommanderOption();
        Thread.sleep(5000);
        // 2.11 Verify the price "$1,475.00"
        String expectedPrice = "$1,475.00";
        String actualPrice = buildYourOwnComputerPage.verifyPrice$1475();
        Assert.assertEquals(actualPrice, expectedPrice, "$1,475.00");
        // 2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputerPage.clickAddToCart();
        // 2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedAlert = "The product has been added to your shopping cart";
        String actualAlert = buildYourOwnComputerPage.verifyGreenBarMessage();
        Assert.assertEquals(actualAlert, expectedAlert, "The product has been added to your shopping cart");
        // After that close the bar clicking on the cross button.
        buildYourOwnComputerPage.clickCloseGreenBar();
        // 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputerPage.mouseHoverCart();
        // 2.15 Verify the message "Shopping cart"
        String expectedMessage1 = "Shopping cart";
        String actualMessage1 = buildYourOwnComputerPage.verifyShoppingCart();
        // 2.16 Change the Qty to "2" and Click on "Update shopping cart"
        buildYourOwnComputerPage.setChangeQty();
        // 2.17 Verify the Total"$2,950.00"
        String expectedTotal = "$2,950.00";
        String actualTotal = buildYourOwnComputerPage.verifyTotal2950();
        Assert.assertEquals(actualAlert, expectedAlert, "$2,950.00");
        // 2.18 click on checkbox “I agree with the terms of service”
        buildYourOwnComputerPage.clickCheckBox();
        // 2.19 Click on “CHECKOUT”
        buildYourOwnComputerPage.clickCheckOut();
        // 2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedSign = "Welcome, Please Sign In!";
        String actualSign = buildYourOwnComputerPage.verifyWelcomeSign();
        Assert.assertEquals(actualSign,expectedSign,"Welcome, Please Sign In!");
        // 2.21Click on “CHECKOUT AS GUEST” Tab
        buildYourOwnComputerPage.clickGuestCheckout();
        // 2.22 Fill the all mandatory field
        billingPage.enterFirstName("Dhara");
        billingPage.lastNameField("Patel");
        billingPage.emailIdField("123@gmail.com");
        billingPage.countryId("456");
        billingPage.cityName("Hounslow");
        billingPage.address("Hanworth");
        billingPage.postCode("tw13 6rt");
        billingPage.phoneNumber("07525446407");
        // 2.23 Click on “CONTINUE”
        billingPage.clickContinueTab();
        // 2.24 Click on Radio Button “Next Day Air($0.00)”
        billingPage.clickRadioTab();
        // 2.25 Click on “CONTINUE”
        billingPage.clickContinueTab1();
        // 2.26 Select Radio Button “Credit Card”
        billingPage.clickRadioTab1();
        // 2.27 Select “Master card” From Select credit card dropdown
        WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='CreditCardType']"));
        Select select2 = new Select(dropdown2);
        select2.selectByIndex(2);
        // 2.28 Fill all the details
        billingPage.enterCardholderName("Dhara Patel");
        billingPage.enterCardNumber("1234 5678 9101 1121 34");
        WebElement expirymonthdropdown = driver.findElement(By.xpath("//select[@id='ExpireMonth']"));
        Select select3 = new Select(expirymonthdropdown);
        select3.selectByValue("3");
        WebElement expiryyeardropdown = driver.findElement(By.xpath("//select[@id='ExpireYear']"));
        Select select4 = new Select(expiryyeardropdown);
        select4.selectByValue("2025");
        billingPage.enterCardCode("111");
        // 2.29 Click on “CONTINUE”
        billingPage.clickContinueTab3();
        // 2.30 Verify “Payment Method” is “Credit Card”
        String expectedPaymentMethod = "Credit Card";
        String actualPaymentMethod = billingPage.verifyPaymentMethod();
        Assert.assertEquals(actualPaymentMethod,expectedPaymentMethod,"Credit Card");
        // 2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedShippingMethod = "Next Day Air";
        String actualShippingMethod = billingPage.verifyShippingMethod();
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod, "Next Day Air");
        // 2.33 Verify Total is “$2,950.00”
        String expectedTotal1 = "$2,950.00";
        String actualTotal1 = billingPage.verifyTotal();
        Assert.assertEquals(actualTotal1, expectedTotal1, "$2,950.00");
        // 2.34 Click on “CONFIRM”
        billingPage.clickOnConfirmTab();
        // 2.35 Verify the Text “Thank You”
        String expectedText = "Thank You";
        String actualText = completedPage.verifyThankYouMessage();
        Assert.assertEquals(actualText, expectedText, "Thank You");
        // 2.36 Verify the message “Your order has been successfully processed!”
        String expectedMessage3 = "Your order has been successfully processed!";
        String actualMessage3 = completedPage.verifySuccessfullyProcessed();
        Assert.assertEquals(actualMessage3,expectedMessage3, "Your order has been successfully processed!");
        // 2.37 Click on “CONTINUE”
        completedPage.clickOnContinueTab3();
        // 2.37 Verify the text “Welcome to our store”
        String expectedWelcome = "Welcome to our store";
        String actualWelcome = homePage.verifyWelcomeToStoreSign();
        Assert.assertEquals(actualWelcome, expectedWelcome, "Welcome to our store");

    }
}
