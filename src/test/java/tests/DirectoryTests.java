package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.DirectoryPage;
import pages.LoginPage;
import utilities.Driver;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;

public class DirectoryTests {
    LoginPage loginPage = new LoginPage();
    CommonPage commonPage = new CommonPage();
    DirectoryPage directoryPage = new DirectoryPage();
    WebDriver driver = Driver.getDriver();


    @BeforeMethod
    public void before(){
        driver = Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.login("Admin", "admin123");

    }

    @Test

    public void test1() throws InterruptedException {
        Thread.sleep(2000);
        commonPage.directory.click();
        Thread.sleep(3000);
        directoryPage.verifyTest();
//        if (!directoryPage.searchButton.isDisplayed()) {
//            directoryPage.searchButton.click();
//        }
        Assert.assertTrue(directoryPage.searchResult.getText().contains("HR Manager"), "yeah");
    }

}
