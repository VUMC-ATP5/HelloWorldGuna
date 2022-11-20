package lekcijaAstoni;

import lekcijaAstoni.pageObjects.CartPage;
import lekcijaAstoni.pageObjects.CheckoutPage;
import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProductsPage;
import lekcijaSeptiniTest.labDarbs.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenarijsDivi extends BaseTest {

    @Test
    public void testCheckoutPageMandatoryFields() throws InterruptedException {
        //navigēt uz saiti - jau ir Base testā
        //ielogotoes ar pareizu lietotājvārdu un paroli
        LoginPage loginPage = new LoginPage(parluks);
        ProductsPage produktuLapa = new ProductsPage(parluks);
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");

        //doties uz grozu
        CartPage grozaLapa = new CartPage(parluks);
        produktuLapa.getCartButton().click();
        Thread.sleep(5000); //lai paskatītos, vai nostrādā
        Assert.assertEquals(grozaLapa.getPagetitle().getText(), "YOUR CART");

        //doties uz čekautu
        grozaLapa.getCheckoutButton().click();

        //pārbaudīt, ka obligāti...
        CheckoutPage checkoutLapa = new CheckoutPage(parluks);
        Assert.assertEquals(checkoutLapa.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getErrorText(), "Error: First Name is required");

        checkoutLapa.inputFirstName("Guna");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getErrorText(), "Error: Last Name is required");
        Thread.sleep(5000);



    }
}
