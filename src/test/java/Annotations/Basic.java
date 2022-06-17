package Annotations;

import org.testng.Assert;
import org.testng.annotations.*;

public class Basic {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This executes Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This executes Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This executes Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This executes Before Method");
    }

    @Test
    public void test(){
        System.out.println("Test itself");
        Assert.assertTrue(true);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This executes After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This executes After Class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This executes After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This executes After Suite");
    }
}
