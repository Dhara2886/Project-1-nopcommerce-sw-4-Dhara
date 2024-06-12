package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By emailId = By.id("Email");
    By passwordField = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerTab = By.id("register-button");
    By completeRegistration = By.xpath("//div[@class='result']");
    By continueTab = By.xpath("//a[normalize-space()='Continue']");

    public String verifyRegisterText(){
        return getTextFromElement(registerText);
    }
    public void setFirstName(String firstName1){
        sendTextToElement(firstName, firstName1);
    }
    public void setLastName(String lastName1){
        sendTextToElement(lastName,lastName1);
    }
    public void setEmailId(String emailId1){
        sendTextToElement(emailId,emailId1);
    }
    public void setPasswordField(String passwordField1){
        sendTextToElement(passwordField, passwordField1);
    }
    public void setConfirmPassword(String confirmPassword1){
        sendTextToElement(confirmPassword, confirmPassword1);
    }
    public void clickOnRegisterTab(){
        clickOnElement(registerTab);
    }
    public void verifyRegistrationComplete(){
        getTextFromElement(completeRegistration);
    }
    public void clickOnContinueTab(){
        clickOnElement(continueTab);
    }
}
