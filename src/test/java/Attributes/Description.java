package Attributes;

import org.testng.annotations.Test;

public class Description {

    @Test(description = "This is test case # 1")
    public void testCase1() {
        System.out.println("Test Case 1");
    }

    @Test(description = "This is test case # 2")
    public void testCase2() {
        System.out.println("Test Case 2");
    }

    @Test(description = "This is test case # 3")
    public void testCase3() {
        System.out.println("Test Case 3");
    }
}
