package Attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {

    @Test(dependsOnMethods = {"testCase3"})
    public void testCase1() {
        System.out.println("Test Case 1");
        Assert.fail();
    }

    @Test
    public void testCase2() {
        System.out.println("Test Case 2");
    }

    @Test
    public void testCase3() {
        System.out.println("Test Case 3");
    }

    @Test(dependsOnMethods = {"testCase1"})
    public void testCase4(){
        System.out.println("Test Case 4");
        Assert.fail();
    }
}
