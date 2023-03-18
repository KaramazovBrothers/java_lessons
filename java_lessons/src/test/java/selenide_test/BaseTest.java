package selenide_test;

import Utilities.PropertyManager;
import Utilities.TestListener;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class BaseTest {

    protected String username;
    protected String password;

    @BeforeSuite
    public void setUp() {
        Configuration.browser = "firefox";
        Configuration.timeout = 10000;
        Configuration.pollingInterval = 10000;
        PropertyManager propertyManager = new PropertyManager();
        username = propertyManager.get("USERNAME");
        password = propertyManager.get("PASSWORD");
        Configuration.headless = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @AfterSuite
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.closeWebDriver();
    }

    @AfterMethod
    public void clearCacheAndCookies() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}
