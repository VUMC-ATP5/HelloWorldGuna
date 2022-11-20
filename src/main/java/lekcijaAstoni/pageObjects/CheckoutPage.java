package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver parluks;

    private By pageTitle = By.className("title");

    private By continueButton = By.id("continue");

    private By errorText = By.cssSelector("h3");

    private By firstNameInputField = By.id("first-name");

    public void inputFirstName(String a){
        parluks.findElement(firstNameInputField).sendKeys(a);
    }


    public CheckoutPage(WebDriver driver) {
        this.parluks = driver;
    }
    public void clickContinueButton(){
        parluks.findElement(continueButton).click();

    }

    public WebElement getPageTitle(){
        return parluks.findElement(pageTitle);
    }
    public String getErrorText(){
        return parluks.findElement(errorText).getText();
    }
}
