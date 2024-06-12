package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/*
1.1 create method with name "selectMenu" it has one parameter name "menu" of type
 string
 1.2 This method should click on the menu whatever name is passed as parameter.
 1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
 select the Menu and click on it and verify the page navigation.
 */
public class TopMenuTest extends BaseTest {

    public void selectMenu(String menu) {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" + menu + "']")).click();
    }

    @Test
    public void verifyPageNavigation() {
        selectMenu("Computers");
        selectMenu("Electronics");
        selectMenu("Apparel");
        selectMenu("Digital downloads");
        selectMenu("Books");
        selectMenu("Jewelry");
        selectMenu("Gift Cards");
    }




}



