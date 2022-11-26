package lekcijaDevini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSearch extends BaseTest {
    @Test
    public void testSearchFunctionality() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.searchProduct("apelsīni");
        Thread.sleep(3000);

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        List<WebElement> searchResultList = searchResultsPage.getSearchResultList();

        Assert.assertEquals(searchResultList.size(),6);

        for (WebElement webElement : searchResultList) {
            System.out.println(webElement.getText());
        }

        mainPage.searchProduct("barankas");
        searchResultList = searchResultsPage.getSearchResultList();
        Thread.sleep(3000);
        Assert.assertEquals(searchResultList.size(),3);




    }
    @Test
    public void testRegistrationWindowClosesCorrectly() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("b-mui-carousel--placeholder")));

        mainPage.clickSignInButton();


        SignInModal signInModal = new SignInModal(driver);
        signInModal.waitForSignInModalToAppear();
        Thread.sleep(3000);
        signInModal.clickCloseButton();
        signInModal.waitForSignInModalToDisappear();
        Assert.assertEquals(signInModal.getModalWindow().size(),0);

    }
}
