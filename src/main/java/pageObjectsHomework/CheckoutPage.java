package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver driver;
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    private By pageTitle = By.className("title");

    private By continueButton = By.id("continue");

    private By errorText = By.cssSelector("h3");

    private By firstNameInputField = By.id("first-name");

    private By lastNameInputField = By.id("last-name");

    private By zipPostalCode = By.id("postal-code");


    public void inputFirstName(String a){
        driver.findElement(firstNameInputField).sendKeys(a);
    }
    public void inputLastName(String b){
        driver.findElement(lastNameInputField).sendKeys(b);
    }
    public void inputZipPostalCode(String c){
        driver.findElement(zipPostalCode).sendKeys(c);
    }
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }

    public WebElement getPageTitle(){
        return driver.findElement(pageTitle);
    }
    public String getErrorText(){
        return driver.findElement(errorText).getText();
    }
}
