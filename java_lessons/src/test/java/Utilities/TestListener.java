package Utilities;

import lombok.extern.log4j.Log4j2;
import org.testng.ITestListener;
import org.testng.ITestResult;

@Log4j2
public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        log.info("Test {} Started", result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        log.info("Test {} Success", result.getName());
    }

    public void onTestFailure(ITestResult result) {
       log.info("Test {} Failure", result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        log.info("Test {} Skipped", result.getName());
    }
}
