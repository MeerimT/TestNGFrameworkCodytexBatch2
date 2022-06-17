package SoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

    @Test
    public void hardAssert(){
        System.out.println("hardAssert Test started");
        Assert.fail();
        System.out.println("hardAssert test finish");
    }

    @Test
    public void softAssert(){
        SoftAssert softAssert = new SoftAssert();

        System.out.println("softAssert Test started");
        softAssert.fail();

        System.out.println("softAssert Test continues");
        softAssert.assertTrue(true);

        System.out.println("softAssert Test end");
    }

    @Test
    public void softAssertAssertAll(){
        SoftAssert softAssert = new SoftAssert();

        System.out.println("softAssert Test started");
        softAssert.fail();

        System.out.println("softAssert Test continues");
        softAssert.assertTrue(true);

        System.out.println("softAssert Test end");
        softAssert.assertAll();
    }
}
