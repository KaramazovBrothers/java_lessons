package selenide_test;

import Steps.LoginPageSteps;
import dev.failsafe.internal.util.Assert;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

@Log4j2
public class LoginTest extends BaseTest {



    @Test
    @Description("Тест добавления товара в корзину")
    @Severity(SeverityLevel.CRITICAL)
    public void BackpackInCheckout() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        log.debug("Class {} initialized", LoginPageSteps.class.getName());
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        log.debug("Class {} initialized", ProductsPage.class.getName());
        productsPage.ClickAddToCardBackpack();
        productsPage.ClickToLinkCheckout();
        CheckoutPage checkoutPage = new CheckoutPage();
        log.debug("Class {} initialized", CheckoutPage.class.getName());
        Assert.isTrue(checkoutPage.checkBackPackInCheckout(), "Backpack not found in checkout");
    }

    @Test
    @Description("Тест для покупки Sauce Labs Onesie")
    @Severity(SeverityLevel.CRITICAL)
    public void OnesieInCheckout() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        log.debug("Class {} initialized", LoginPageSteps.class.getName());
        loginPageSteps.login(username, password); //использовали данные из property. Глянь в BaseTest
        ProductsPage productsPage = new ProductsPage();
        log.debug("Class {} initialized", ProductsPage.class.getName());
        productsPage.ClickAddToCardOnesie();
        productsPage.ClickToLinkCheckout();
        CheckoutPage checkoutPage = new CheckoutPage();
        log.debug("Class {} initialized", CheckoutPage.class.getName());
        Assert.isTrue(checkoutPage.checkOnesieInCheckout(), "Onesie not found in checkout");
    }

    @Test
    @Description("Тест на проверку сортировок по цене. Тест хайпрайс")
    @Severity(SeverityLevel.MINOR)
    public void checkSortHilo() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        log.debug("Class {} initialized", LoginPageSteps.class.getName());
        loginPageSteps.login(username, password); //использовали данные из property. Глянь в BaseTest
        ProductsPage productsPage = new ProductsPage();
        log.debug("Class {} initialized", ProductsPage.class.getName());
        productsPage.ClickToSortContainer();
        productsPage.ClickSortHilo();
        productsPage.checkSortHilo();
        Assert.isTrue(productsPage.checkSortHilo(), "Sort isn`t hilo");
    }

    @Test
    @Description("Тест на проверку сортировок по цене. Тест лоупрайс")
    @Severity(SeverityLevel.MINOR)
    public void checkSortLohi() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        log.debug("Class {} initialized", LoginPageSteps.class.getName());
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        log.debug("Class {} initialized", ProductsPage.class.getName());
        productsPage.ClickToSortContainer();
        productsPage.ClickSortLohi();
        productsPage.checkSortLohi();
        Assert.isTrue(productsPage.checkSortLohi(), "Sort isn`t lohi");
    }

    @Test
    @Description("Тест для проверки функциональности удаления продукта из корзины")
    @Severity(SeverityLevel.CRITICAL)
    public void checkDeleteItemFromCheckout() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        log.debug("Class {} initialized", LoginPageSteps.class.getName());
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        log.debug("Class {} initialized", ProductsPage.class.getName());
        productsPage.ClickAddToCardBackpack();
        productsPage.ClickToLinkCheckout();
        CheckoutPage checkoutPage = new CheckoutPage();
        log.debug("Class {} initialized", CheckoutPage.class.getName());
        checkoutPage.clickRemoveBackpack();
        checkoutPage.checkNotVisibleBackPackInCheckout();
    }

    @Test
    @Description("Тест для проверки функциональности логаута")
    @Severity(SeverityLevel.MINOR)
    public void logout() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        log.debug("Class {} initialized", LoginPageSteps.class.getName());
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        log.debug("Class {} initialized", ProductsPage.class.getName());
        productsPage.ClickBurgerMenu();
        productsPage.ClickLogout();
        LoginPage loginPage = new LoginPage();
        log.debug("Class {} initialized", ProductsPage.class.getName());
        Assert.isTrue(loginPage.CheckVisibleLoginCredentials(), "Logout failed");
    }

    @Test(dataProvider = "InvalidLogindata")
    @Description("Тест логина с невалидными параметрами")
    @Severity(SeverityLevel.BLOCKER)
    public void dataProviderDemo(String email, String password) {
        LoginPage loginPage = new LoginPage();
        log.debug("Class {} initialized", LoginPage.class.getName());
        loginPage
                .openPage()
                .inputEmail(email)
                .inputPassword(password)
                .clickLogin();
        Assert.isTrue(loginPage.CheckVisibleLoginCredentials(), "Negative Login Test is failed");
    }

    @DataProvider(name="InvalidLogindata")
    public Object[][] Login() {
        return new Object[][] {
                {"Tratata", "666"},
                {"",""},
                {"", "666"}
        };
    }

    @Test
    @Description("Тест логина с валидными параметрами. Данные логина и пароля из файла конфига")
    @Severity(SeverityLevel.BLOCKER)
    public void LoginTest() {
        LoginPage loginPage = new LoginPage();
        log.debug("Class {} initialized", LoginPage.class.getName());
        loginPage.openPage();
        loginPage.inputEmail(username);
        loginPage.inputPassword(password);
        loginPage.clickLogin();
        ProductsPage productsPage = new ProductsPage();
        log.debug("Class {} initialized", ProductsPage.class.getName());
        Assert.isTrue(productsPage.checkHeader(), "Login is failed");
    }

    @Test
    @Description("Тест логина с валидными параметрами. Данные логина и пароля из конфигурации TestNG")
    @Severity(SeverityLevel.BLOCKER)
    public void LoginTestWithTestNGConfig() {
        LoginPage loginPage = new LoginPage();
        log.debug("Class {} initialized", LoginPage.class.getName());
        loginPage.openPage();
        loginPage.inputEmail(System.getProperty("username"));
        loginPage.inputPassword(System.getProperty("password"));
        loginPage.clickLogin();
        ProductsPage productsPage = new ProductsPage();
        log.debug("Class {} initialized", ProductsPage.class.getName());
        Assert.isTrue(productsPage.checkHeader(), "Login is failed");
    }
}
