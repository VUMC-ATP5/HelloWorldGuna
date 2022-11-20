package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutSuccessPage {
    WebDriver driver;

    public CheckoutSuccessPage(WebDriver driver) {
        this.driver = driver;
    }

    private By pageTitle = By.className("title");

    private By completeHeader = By.className("complete-header");

    private By completeText = By.className("complete-text");

    private By backHomeButton = By.id("back-to-products");


    public String getPageTitle(){
        return driver.findElement(pageTitle).getText();
    }

    public String getCompleteheader(){
      return driver.findElement(completeHeader).getText();
    }
    public String getCompleteText (){
        return driver.findElement(completeText).getText();
    }
    public void clickBackHomeButton(){
        driver.findElement(backHomeButton).click();
    }

    }
