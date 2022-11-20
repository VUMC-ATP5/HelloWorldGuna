package seleniumHomework;

import lekcijaAstoni.pageObjects.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectsHomework.*;

public class sauceDemoTests {
    public WebDriver driver;
    WebDriverWait wait;


    @BeforeMethod
    public void setupBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //tiešā gaidīšana
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //netiešā gaidīšana
        driver.navigate().to("https://www.saucedemo.com");
    }

    @AfterMethod
    public void tearDownBrowser(){
        driver.quit();
    }

    //1.scenārijs
    @Test
    public void fullCircleTest() throws InterruptedException {
        pageObjectsHomework.LoginPage loginPage = new LoginPage(driver);
        InventoryPage produktuLapa = new InventoryPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(produktuLapa.getPageTitle(), "PRODUCTS");
        //ievietot grozā 1 produktu
        pageObjectsHomework.CartPage grozaLapa = new CartPage(driver);
        produktuLapa.getAddToCartButton().click();
        //doties uz grozu
        produktuLapa.getCartButton().click();
        Assert.assertEquals(grozaLapa.getPageTitle(), "YOUR CART");
        //pārbaudīt, ka šī prece ir grozā
        Assert.assertEquals(produktuLapa.getItemTitle(), grozaLapa.getItemName().getText());
        Assert.assertEquals(grozaLapa.getCartQuantity(), "1");
        Assert.assertEquals(grozaLapa.getItemPrice(), produktuLapa.getItemPrice());
        //doties uz čekautu
        grozaLapa.getCheckoutButton().click();
        //Ievadīt vārdu/uzvārdu/pasta indeksu
        CheckoutPage checkoutLapa = new CheckoutPage(driver);
        checkoutLapa.inputFirstName("Guna");
        checkoutLapa.inputLastName("Vendina");
        checkoutLapa.inputZipPostalCode("LV-1005");
        //Doties uz Checkout overview lapu, pārbaudīt datus
        checkoutLapa.clickContinueButton();
        CheckoutOverviewPage chekautaParskataLapa = new CheckoutOverviewPage(driver);
        Assert.assertEquals(chekautaParskataLapa.getPageTitle(),"CHECKOUT: OVERVIEW");
        Assert.assertEquals(grozaLapa.getItemName().getText(), chekautaParskataLapa.getItemNameTitle().getText());
        Assert.assertEquals(chekautaParskataLapa.getCartQuantity(), "1");
        Assert.assertEquals(produktuLapa.getItemPrice(), chekautaParskataLapa.getItemsPrice());
        //Doties uz finish lapu un pārbaudīt vai viss bija veiksmīgi
        chekautaParskataLapa.getFinishButton().click();
        CheckoutSuccessPage checkoutaBeiguLapa = new CheckoutSuccessPage(driver);
        Assert.assertEquals(checkoutaBeiguLapa.getPageTitle(), "CHECKOUT: COMPLETE!");
        Assert.assertEquals(checkoutaBeiguLapa.getCompleteheader(), "THANK YOU FOR YOUR ORDER");
        Assert.assertEquals(checkoutaBeiguLapa.getCompleteText(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
        //Doties atpakaļ uz pirmo lapu ar pogu 'Back Home'
        checkoutaBeiguLapa.clickBackHomeButton();

    }


    //2.scenārijs

    @Test
    public void testCheckoutPageMandatoryFields() throws InterruptedException {
        //navigēt uz saiti - jau ir Base testā
        //ielogotoes ar pareizu lietotājvārdu un paroli
        pageObjectsHomework.LoginPage loginPage = new LoginPage(driver);
        InventoryPage produktuLapa = new InventoryPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(produktuLapa.getPageTitle(), "PRODUCTS");

        //doties uz grozu
        pageObjectsHomework.CartPage grozaLapa = new CartPage(driver);
        produktuLapa.getCartButton().click();
        Thread.sleep(5000); //lai paskatītos, vai nostrādā
        Assert.assertEquals(grozaLapa.getPageTitle(), "YOUR CART");

        //doties uz čekautu
        grozaLapa.getCheckoutButton().click();

        //pārbaudīt, ka obligāti...
        pageObjectsHomework.CheckoutPage checkoutLapa = new CheckoutPage(driver);
        Assert.assertEquals(checkoutLapa.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getErrorText(), "Error: First Name is required");

        checkoutLapa.inputFirstName("Guna");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getErrorText(), "Error: Last Name is required");

        checkoutLapa.inputLastName("Vendina");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getErrorText(), "Error: Postal Code is required");

}
}

