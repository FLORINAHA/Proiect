package org.florina.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".products-grid li.item")
    private List<WebElementFacade> listOfFoundProducts;

    public boolean checkFromListOfFoundProductsTheProduct(String productName){
        for(WebElementFacade element : listOfFoundProducts){
            if(element.findElement(By.cssSelector(".Baby girl cardigan")).getText().equalsIgnoreCase(productName)){
                return true;
            }
        }
        return false;
    }
    public void selectProductFromList(String product){
        for(WebElementFacade element : listOfFoundProducts){
            if(element.findElement(By.cssSelector(" .product-name a")).getText().equalsIgnoreCase(product)){
                element.findElement(By.cssSelector(".Baby girl cardigan ")).click();
                break;
            }
        }
    }
}