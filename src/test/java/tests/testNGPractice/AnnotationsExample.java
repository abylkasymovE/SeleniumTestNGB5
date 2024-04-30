package tests.testNGPractice;

import org.testng.Assert;
import org.testng.annotations.*;
import tests.PIMTests;

public class AnnotationsExample {

    @BeforeSuite
    public static void beforeSuiteMethod(){
        System.out.println("Setting up the suite environment.");
    }

    @BeforeTest
    public static void beforeTestMethod(){
        System.out.println("Configuring test environment.");
    }

    @BeforeClass
    public static void beforeClassMethod(){
        System.out.println("Loading class resources");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Initializing test method setup.");
    }

    @Test
    public void test1(){
        Assert.assertTrue(2<10);
    }
    @Test
    public void test2(){
        Assert.assertTrue(2>1.5);
    }
    @Test
    public void test3(){
        Assert.assertTrue(22>10);
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Cleaning up after test method.");
    }

    @AfterClass
    public static void afterClassMethod(){
        System.out.println("Releasing class resources");
    }

    @AfterTest
    public static void afterTestMethod(){
        System.out.println("Tearing down test environment");
    }

    @AfterSuite
    public static void afterSuiteMethod(){
        System.out.println("Cleaning up the suite environment.");
    }




}
