package selenide_test;

import Steps.LoginPageSteps;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

import static com.codeborne.selenide.Selenide.$;

public class LoginTest extends BaseTest {

    @Test //Рефактор предыдущего теста с проверкой добавления товара в корзину
    public void BackpackInCheckout() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        productsPage.ClickAddToCardBackpack();
        productsPage.ClickToLinkCheckout();
        CheckoutPage checkoutPage = new CheckoutPage();
        Assert.isTrue(checkoutPage.checkBackPackInCheckout(), "Backpack not found in checkout");
    }

    @Test // Тест для покупки Sauce Labs Onesie
    public void OnesieInCheckout() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login(username, password); //использовали данные из property. Глянь в BaseTest
        ProductsPage productsPage = new ProductsPage();
        productsPage.ClickAddToCardOnesie();
        productsPage.ClickToLinkCheckout();
        CheckoutPage checkoutPage = new CheckoutPage();
        Assert.isTrue(checkoutPage.checkOnesieInCheckout(), "Onesie not found in checkout");
    }

    @Test // Тест на проверку сортировок по цене. Тест хайпрайс
    public void checkSortHilo() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login(username, password); //использовали данные из property. Глянь в BaseTest
        ProductsPage productsPage = new ProductsPage();
        productsPage.ClickToSortContainer();
        productsPage.ClickSortHilo();
        productsPage.checkSortHilo();
        Assert.isTrue(productsPage.checkSortHilo(), "Sort isn`t hilo");
    }

    @Test // Тест на проверку сортировок по цене. Тест лоупрайс
    public void checkSortLohi() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        productsPage.ClickToSortContainer();
        productsPage.ClickSortLohi();
        productsPage.checkSortLohi();
        Assert.isTrue(productsPage.checkSortLohi(), "Sort isn`t lohi");
    }

    @Test // Тест для проверки функциональности удаления продукта из корзины
    public void checkDeleteItemFromCheckout() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        productsPage.ClickAddToCardBackpack();
        productsPage.ClickToLinkCheckout();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickRemoveBackpack();
        checkoutPage.checkNotVisibleBackPackInCheckout();
    }

    @Test // Тест для проверки функциональности логаута
    public void logout() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        productsPage.ClickBurgerMenu();
        productsPage.ClickLogout();
        LoginPage loginPage = new LoginPage();
        Assert.isTrue(loginPage.CheckVisibleLoginCredentials(), "Logout failed");
    }

    //Тест логина с невалидными параметрами
    @Test(dataProvider = "InvalidLogindata")
    public void dataProviderDemo(String email, String password) {
        LoginPage loginPage = new LoginPage();
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

    //Тест логина с валидными параметрами. Данные логина и пароля из файла конфига
    @Test
    public void LoginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.inputEmail(username);
        loginPage.inputPassword(password);
        loginPage.clickLogin();
        ProductsPage productsPage = new ProductsPage();
        Assert.isTrue(productsPage.checkHeader(), "Login is failed");
    }

    //Тест логина с валидными параметрами. Данные логина и пароля из конфигурации TestNG.
    @Test
    public void LoginTestWithTestNGConfig() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        $(By.id("user-name")).sendKeys(System.getProperty("username"));
        $(By.id("password")).sendKeys(System.getProperty("password"));
        loginPage.clickLogin();
        ProductsPage productsPage = new ProductsPage();
        Assert.isTrue(productsPage.checkHeader(), "Login is failed");
    }
}
