package AnnotationAttributes.DataProvider;

import org.testng.annotations.DataProvider;

public class Data {

    @DataProvider(name = "numbers")
    public Object[][] numbers() {
        return new Object[][]{
                {1, 2, 3},
                {2, 4, 6},
                {15, 23, 38},
                {15, 23, 44}
        };
    }
}
