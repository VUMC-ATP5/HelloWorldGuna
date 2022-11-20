package lekcijaSeptiniTest.labDarbs;

import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoLoginTest extends BaseTest{

    @Test
    public void testLoginPageObjectExample(){
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("Guna", "asdas");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match any user in this service");
    }
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("standard_user", "secret_sauce");
        ProductsPage produktuLapa = new ProductsPage(parluks);
        // JĀPABEIDZ ŠĪ RINDA!!! wait.until(ExpectedConditions.visibilityOf(login))
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");
    }


    @Test
    public void testLoginWrongUsernameAndPasword(){
        testLogin("asdas", "12345", "Epic sadface: Username and password do not match any user in this service");
//TDD - test driven development - vispirms saraksta testus (pēc specifikācijas), tad raksta kodu, kamēr visi testi ir zaļi
    }
    @Test
    public void testLoginEmptyUsernameAndPassword(){
        testLogin("", "", "Epic sadface: Username is required");
    }
    @Test
    public void testLoginEmptyUsernameFilledPassword(){
        testLogin("", "12345aa", "Epic sadface: Username is required");
    }

    @Test
    public void testLoginFilledUsernameEmptyPassword(){
        testLogin("Anug", "", "Epic sadface: Password is required");
    }




    @Test

    private void testLogin(String username, String password, String expectedErrorMessage){
        WebElement userNameInputField = parluks.findElement(By.id("user-name"));
        userNameInputField.sendKeys(username);

        WebElement passwordInputField = parluks.findElement(By.id("password"));
        passwordInputField.sendKeys(password);

        WebElement loginButton = parluks.findElement(By.id("login-button"));
        loginButton.click();

        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));
        String errorText = errorTextField.getText();
        Assert.assertEquals(errorText, expectedErrorMessage);
    }



}
