package lekcijaSeptiniTest.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver parluks;

    @BeforeMethod
    public void setupBrowser(){
        parluks = new ChromeDriver();
        parluks.manage().window().maximize();
        parluks.navigate().to("https://www.lu.lv");
    }

    @AfterMethod
    public void tearDownBrowser(){
       parluks.quit();
    }


    @Test
    public void testFirstWebpage(){
        System.out.println("Pirmais Selenium tests");
    }

    //https://chromedriver.chromium.org/downloads

    @Test
    public void testPageTitle(){
        parluks.getTitle();
        String nosaukums = parluks.getTitle();
        Assert.assertEquals(nosaukums, "Latvijas Universitāte");
    }
}
