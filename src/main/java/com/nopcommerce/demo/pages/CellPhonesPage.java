package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {
    By getCellPhonesText = By.xpath("//h1[normalize-space()='Cell phones']");
    By listView = By.xpath("//a[normalize-space()='List']");
    By nokiaLumia1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");

    public void verifyCellPhonesText(){
        getTextFromElement(getCellPhonesText);
    }
    public void clickOnListView(){
        clickOnElement(listView);
    }
    public void clickOnNokiaLumia1020(){
        clickOnElement(nokiaLumia1020);
    }
}
