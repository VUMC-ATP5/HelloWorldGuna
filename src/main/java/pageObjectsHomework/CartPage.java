package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By pageTitle = By.className("title");
    private By checkoutButton = By.id("checkout");

    private By itemName = By.id("item_0_title_link");
    private By cartQuantity = By.cssSelector("#cart_contents_container > div > div.cart_list > div.cart_item > div.cart_quantity");

    private By itemPrice = By.className("inventory_item_price");


    public WebElement getCheckoutButton(){
        return driver.findElement(checkoutButton);
    }
    public String getPageTitle(){
        return driver.findElement(pageTitle).getText();
    }
    public WebElement getItemName(){
        return driver.findElement(itemName);
    }
    public String getCartQuantity(){
        return driver.findElement(cartQuantity).getText();
    }
    public String getItemPrice(){
        return driver.findElement(itemPrice).getText();
    }
}
