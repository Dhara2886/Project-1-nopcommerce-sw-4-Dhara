package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {
   By desktopTab = By.xpath("(//h2[@class='title'])[1]");

   public void clickDesktopTab(){
       clickOnElement(desktopTab);
   }
}
