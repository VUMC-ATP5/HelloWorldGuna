package lekcijaSeptiniTest.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoProductsTest extends BaseTest{
    @Test
    public void testAddProductTuCart() throws InterruptedException {
        WebElement userNameInputField = parluks.findElement(By.id("user-name"));
        userNameInputField.sendKeys("standard_user");

        WebElement passwordField = parluks.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = parluks.findElement(By.id("login-button"));
        loginButton.click();

        WebElement productPageTitle = parluks.findElement(By.cssSelector("span.title"));
        String actualPageTitleText = productPageTitle.getText();
        Assert.assertEquals(actualPageTitleText,"PRODUCTS");

        Thread.sleep(5000);
    }

}
