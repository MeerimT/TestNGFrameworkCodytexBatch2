package Attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {

    @Test
    public void failTest() {
        System.out.println("Failing Test");
        Assert.fail();
    }

    @Test(dependsOnMethods = "failTest")
    public void dependantTest1() {
        System.out.println("Dependant test without alwaysRun");
    }

    @Test(dependsOnMethods = "failTest", alwaysRun = true)
    public void dependantTest2() {
        System.out.println("Dependant test with alwaysRun");
    }
}
