package AnnotationAttributes.DataProvider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test(dataProvider = "numbers", dataProviderClass = Data.class)
    public void sumTest(int num1, int num2, int result) {
        System.out.println("Data says: \"" + num1 + " + " + num2 + " is equal to " + result + "\"");
        Assert.assertEquals(num1 + num2, result, "Actual result is: " + (num1 + num2));
    }
}
