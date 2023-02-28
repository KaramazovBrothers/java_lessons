package selenide_test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void setUp() {
        Configuration.timeout = 10000;
        Configuration.pollingInterval = 10000;
       // Configuration.headless = true;

    }

    @AfterSuite
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.closeWebDriver();
    }
}
