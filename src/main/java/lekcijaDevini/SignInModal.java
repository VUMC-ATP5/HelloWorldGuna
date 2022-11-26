package lekcijaDevini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SignInModal {
    WebDriver driver;
    WebDriverWait wait;

    public SignInModal(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    By modalWindow = By.cssSelector("div.b-login-modal");
    By closeButton = By.cssSelector("div.b-login-modal button.close");


    public void waitForSignInModalToAppear(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalWindow));
    }
    public void clickCloseButton(){
        driver.findElement(closeButton).click();
    }
    public void waitForSignInModalToDisappear(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(modalWindow));
    }
    public List<WebElement> getModalWindow(){
        return driver.findElements(modalWindow);
    }


}

