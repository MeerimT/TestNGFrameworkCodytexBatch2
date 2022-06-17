package Attributes;

import org.testng.annotations.Test;

public class TimeOut {

    @Test(timeOut = 200)
    public void testCase1() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("1st Test Case");
    }

    @Test(timeOut = 200)
    public void testCase2() {
        System.out.println("2nd Test Case");
    }
}
