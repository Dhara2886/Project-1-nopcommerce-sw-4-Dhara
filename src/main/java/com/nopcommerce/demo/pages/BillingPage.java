package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BillingPage extends Utility {
    By firstNameField = By.id("BillingNewAddress_FirstName");
    By lastNameField = By.id("BillingNewAddress_LastName");
    By emailIdField = By.id("BillingNewAddress_Email");
    By countryId = By.id("BillingNewAddress_CountryId");
    By cityName = By.id("BillingNewAddress_City");
    By address = By.id("BillingNewAddress_Address1");
    By postCode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By continueTab = By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; Billing.save()']");
    By radioButton = By.id("shippingoption_1");
    By continueTab1 = By.xpath("(//button[@class='button-1 shipping-method-next-step-button'])[1]");
    By radioButton1 = By.xpath("(//input[@id='paymentmethod_1'])[1]");
    By cardholderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("(//input[@id='CardNumber'])[1]");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continueTab3 = By.xpath("(//button[@class='button-1 payment-info-next-step-button'])[1]");
    By getPaymentMethod = By.xpath("//span[normalize-space()='Credit Card']");
    By getShippingMethod = By.xpath("//span[normalize-space()='Next Day Air']");
    By getTotal = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By clickConfirmTab = By.xpath("//button[normalize-space()='Confirm']");
    By secondDayAir = By.xpath("//input[@id='shippingoption_2']");
    By shippingMethod1 = By.xpath("//span[normalize-space()='2nd Day Air']");
    By total698 = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");


    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField,firstName);
    }
    public void lastNameField(String lastName){
        sendTextToElement(lastNameField,lastName);
    }
    public void emailIdField(String emailId){
        sendTextToElement(emailIdField,emailId);
    }
    public void countryId(String countryId1){
        selectByValueFromDropDown(countryId,countryId1);
    }
    public void cityName(String cityName1){
        sendTextToElement(cityName,cityName1);
    }
    public void address(String address1){
        sendTextToElement(address,address1);
    }
    public void postCode(String postCode1){
        sendTextToElement(postCode,postCode1);
    }
    public void phoneNumber(String phoneNumber1){
        sendTextToElement(phoneNumber,phoneNumber1);
    }
    public void clickContinueTab(){
        clickOnElement(continueTab);
    }
    public void clickRadioTab(){
        clickOnElement(radioButton);
    }
    public void clickContinueTab1(){
        clickOnElement(continueTab1);
    }
    public void clickRadioTab1(){
        clickOnElement(radioButton1);
    }
    public void enterCardholderName(String CardholderName){
        sendTextToElement(cardholderName, CardholderName);
    }
    public void enterCardNumber(String CardNumber){
        sendTextToElement(cardNumber, CardNumber);
    }
    public void enterCardCode(String CardCodeNumber){
        sendTextToElement(cardCode, CardCodeNumber);
    }
    public void clickContinueTab3(){
        clickOnElement(continueTab3);
    }
    public String verifyPaymentMethod(){
       return getTextFromElement(getPaymentMethod);
    }
    public String verifyShippingMethod(){
       return getTextFromElement(getShippingMethod);
    }
    public String verifyTotal(){
        return getTextFromElement(getTotal);
    }
    public void clickOnConfirmTab(){
        clickOnElement(clickConfirmTab);
    }
    public void clickOn2ndDayAir(){
        clickOnElement(secondDayAir);
    }
    public String verifyShippingMethod1(){
        return getTextFromElement(shippingMethod1);
    }
    public String verifyTotal698(){
        return getTextFromElement(total698);
    }


}
