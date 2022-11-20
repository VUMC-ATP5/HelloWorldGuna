package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {

    WebDriver driver;
    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }
    private By pageTitle = By.className("title");
    private By itemNameTitle = By.id("item_0_title_link");

    private By cartQuantity = By.className("cart_quantity");

    private By itemsPrice = By.className("inventory_item_price");

    private By finishButton = By.id("finish");


    public String getPageTitle(){
        return driver.findElement(pageTitle).getText();
    }
    public WebElement getItemNameTitle(){
        return driver.findElement(itemNameTitle);
    }
    public WebElement getFinishButton() {
        return driver.findElement(finishButton);
    }
    public String getItemsPrice(){
        return driver.findElement(itemsPrice).getText();
    }
    public String getCartQuantity() {
        return driver.findElement(cartQuantity).getText();
    }
}
