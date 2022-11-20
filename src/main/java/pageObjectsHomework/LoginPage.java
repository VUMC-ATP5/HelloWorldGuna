package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private By usernameInputField = By.id("user-name");

    private By passwordInputField = By.id("password");

    private By loginButton = By.id("login-button");

    private By errorTextField = By.cssSelector("div.error-message-container h3");

    public WebElement getUsernameField(){
        return driver.findElement(usernameInputField);
    }
    public WebElement getPasswordField(){
        return driver.findElement(passwordInputField);
    }
    public WebElement getLoginButton(){
        return driver.findElement(loginButton);
    }

    public String getErrorText(){
        return driver.findElement(errorTextField).getText();
    }

    public void login(String username, String password){
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
    }


}
