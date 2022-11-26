package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage{

    public CheckoutPage(WebDriver parluks) {
        super(parluks);
    }

    private By continueButton = By.id("continue");

    private By errorText = By.cssSelector("h3");

    private By firstNameInputField = By.id("first-name");

    public void inputFirstName(String a){
        parluks.findElement(firstNameInputField).sendKeys(a);
    }



    public void clickContinueButton(){
        parluks.findElement(continueButton).click();

    }


    public String getErrorText(){
        return parluks.findElement(errorText).getText();
    }
}
