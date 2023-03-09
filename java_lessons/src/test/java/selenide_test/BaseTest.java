package selenide_test;

import Utilities.PropertyManager;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    protected String username;
    protected String password;

    @BeforeSuite
    public void setUp() {
        Configuration.timeout = 10000;
        Configuration.pollingInterval = 10000;
        PropertyManager propertyManager = new PropertyManager();
        username = propertyManager.get("USERNAME");
        password = propertyManager.get("PASSWORD");
       // Configuration.headless = true;

    }

    @AfterSuite
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.closeWebDriver();
    }
}
