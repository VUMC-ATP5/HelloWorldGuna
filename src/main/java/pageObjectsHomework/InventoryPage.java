package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    WebDriver driver;

    private By pageTitle = By.cssSelector("span.title");

    private By itemTitle = By.id("item_0_title_link");
    private By addToCartButton = By.id("add-to-cart-sauce-labs-bike-light");
    private By cartButton = By.id("shopping_cart_container");

    private By itemPrice = By.className("inventory_item_price");


    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }


    public String getPageTitle(){
        return driver.findElement(pageTitle).getText();
    }

    public String getItemTitle(){
        return driver.findElement(itemTitle).getText();
    }
    public WebElement getAddToCartButton(){
        return driver.findElement(addToCartButton);
    }
    public WebElement getCartButton(){
        return driver.findElement(cartButton);
    }

    public String getItemPrice(){
        return driver.findElement(itemPrice).getText();
    }
}
