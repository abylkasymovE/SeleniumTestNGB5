package tests.exampleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EtsyTest {

    @Test (groups = {"sanity"})
    public void etsyTest(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.etsy.com");
    }
    @Test (groups = {"loginTest"})
    public void login1(){
        System.out.println("login etsy test 1");
    }
    @Test (groups = {"loginTest"})
    public void login2(){
        System.out.println("login etsy test 2");
    }

    @BeforeTest (groups = "sanity")
    public static void beforeTestMethod(){
        System.out.println("THIS IS BEFORE TEST METHOD IN ETSY");
    }

    @AfterTest
    public static void afterTestMethod(){
        System.out.println("THIS IS AFTER TEST METHOD IN ETSY");
    }
}
