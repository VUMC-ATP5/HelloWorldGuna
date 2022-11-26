package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{
    public CartPage(WebDriver parluks) {
        super(parluks);
    }
    private By checkoutButton = By.id("checkout");
    public WebElement getCheckoutButton(){
        return parluks.findElement(checkoutButton);
    }



}
