package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends Utility {
    By sortByTabZToA = By.xpath("//option[contains(text(),'Name: Z to A')]");
    By productNames = By.xpath("//h2[@class='product-title']//a");
    By sortByTabAToZ = By.xpath("//option[contains(text(),'Name: A to Z')]");
    By addToCart = By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");

    public void selectZToA(){
        clickOnElement(sortByTabZToA);
    }
    public List<String> listProductList(){
        List<String>listofProducts = new ArrayList<>();

        for(WebElement ele : findMultipleElements(productNames)){
            listofProducts.add(ele.getText().trim());
        }
        return listofProducts;
    }
    public void selectAToZ(){
        clickOnElement(sortByTabAToZ);
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }


}
