package tests.exampleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import tests.PIMTests;
import utilities.Driver;
import utilities.SeleniumUtils;

public class GoogleTest {

    @Test (groups = {"login"})
    public void googleTest1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }

    @Test (groups = {"login"})
    public void googleTest2(){
        System.out.println("This is a test2 of google");
        SeleniumUtils.waitForSeconds(5);

    }

    @Test (groups = {"sanity"})
    public void googleTest3(){
        System.out.println("This is a test3 of google");
        SeleniumUtils.waitForSeconds(10);

    }

    @Test (groups = {"loginTest"})
    public void login1(){
        System.out.println("login google test 1");
    }
    @Test (groups = {"loginTest"})
    public void login2(){
        System.out.println("login google test 2");
    }

    @BeforeSuite
    public static void beforeSuiteMethod(){
        System.out.println("THIS IS BEFORE SUITE INSIDE GOOGLE");
    }

    @AfterSuite
    public static void afterSuiteMethod(){
        System.out.println("THIS IS AFTER SUITE INSIDE GOOGLE");
    }

    @BeforeTest (groups = {"sanity"})
    public static void beforeTestMethod(){
        System.out.println("THIS IS BEFORE TEST METHOD IN GOOGLE");
    }

    @AfterTest (groups = "sanity")
    public static void afterTestMethod(){
        System.out.println("THIS IS AFTER TEST METHOD IN GOOGLE");
    }

    @BeforeGroups (groups = "sanity")
    public static void beforeGroup(){
        System.out.println("BEFORE GROUP");
    }
}
