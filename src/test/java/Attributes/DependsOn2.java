package Attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn2 {

    @Test(dependsOnMethods = {"testCase3", "testCase2"})
    public void testCase1() {
        System.out.println("Test Case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("Test Case 2");
    }

    @Test
    public void testCase3() {
        System.out.println("Test Case 3");
    }
}
