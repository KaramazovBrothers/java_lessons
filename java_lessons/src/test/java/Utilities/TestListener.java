package Utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(String.format("Test %s Started", result.getName()));
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println(String.format("Test %s Success", result.getName()));
    }

    public void onTestFailure(ITestResult result) {
        System.out.println(String.format("Test %s Failure", result.getName()));
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println(String.format("Test %s Skipped", result.getName()));
    }
}
