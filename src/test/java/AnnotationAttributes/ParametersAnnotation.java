package AnnotationAttributes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAnnotation {

    @Test
    @Parameters({"num1", "num2"})
    public void sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum of two numbers: " + sum);
    }

    @Test
    @Parameters({"num3", "num2"})
    public void sub(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println("Subtraction of two numbers: " + sub);
    }
}
