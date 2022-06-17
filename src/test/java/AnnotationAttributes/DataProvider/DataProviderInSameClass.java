package AnnotationAttributes.DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInSameClass {

    @Test(dataProvider = "studentsNames")
    public void multipleTests1(String name) {
        System.out.println(name);
    }

    @DataProvider(name = "studentsNames")
    public Object[] names() {
        return new Object[]{
                "John",
                "Patel",
                "Kumar",
                "Nurbek",
                "Sathya",
                "Vedat",
                "Garnik"
        };
    }

    @Test(dataProvider = "studentsNamesWithOrder")
    public void multipleTest2(String firstName, String lastName, int order) {
        System.out.println(order + ": " + firstName + " " + lastName);
    }

    @DataProvider(name = "studentsNamesWithOrder")
    public Object[][] fullNames() {
        return new Object[][]{
                {"John", "Doe", 1},
                {"Patel", "Atilla", 2},
                {"Kumar", "Priyan", 3},
                {"Nurbek", "Aminov", 4},
                {"Sathya", "Harris", 5},
                {"Vedat", "Vineela", 6},
                {"Garnik", "Davis", 7}
        };
    }
}
