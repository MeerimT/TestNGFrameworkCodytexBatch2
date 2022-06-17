package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listener implements ITestListener {

        @Override
        public void onTestStart(ITestResult result) {
            System.out.println("Starting test: " + result.getName());
        }

        @Override
        public void onTestSuccess(ITestResult result) {
            System.out.println("Success of test case and its details are: " + result.getName());
        }

        @Override
        public void onTestFailure(ITestResult result) {
            System.out.println("Failure of test case and its details are: " + result.getName());
        }

        @Override
        public void onTestSkipped(ITestResult result) {
            System.out.println("Skip of test case and its details are: " + result.getName());
        }

        @Override
        public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
            System.out.println("Failure of test case and its details are: " + result.getName());
        }


    @Override
        public void onStart(ITestContext context) {
            System.out.println("Start");
        }

        @Override
        public void onFinish(ITestContext context) {
            System.out.println("Finish");
        }
    }

