package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver parluks;

    private By checkoutButton = By.id("checkout");
    private By pageTitle = By.className("title");

    public CartPage(WebDriver parluks) {
        this.parluks = parluks;
    }
    public WebElement getCheckoutButton(){
        return parluks.findElement(checkoutButton);
    }
    public WebElement getPagetitle(){
        return parluks.findElement(pageTitle);
    }


}
