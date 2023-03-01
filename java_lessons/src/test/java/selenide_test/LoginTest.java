package selenide_test;

import Steps.LoginPageSteps;
import dev.failsafe.internal.util.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

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
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        productsPage.ClickAddToCardOnesie();
        productsPage.ClickToLinkCheckout();
        CheckoutPage checkoutPage = new CheckoutPage();
        Assert.isTrue(checkoutPage.checkOnesieInCheckout(), "Onesie not found in checkout");
    }

    @Test // Тест на проверку сортировок по цене. Тест хайпрайс
    public void checkSortHilo() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        productsPage.ClickToSortContainer();
        productsPage.ClickSortHilo();
        productsPage.checkSortHilo();
    }

    @Test // Тест на проверку сортировок по цене. Тест лоупрайс
    public void checkSortLohi() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage();
        productsPage.ClickToSortContainer();
        productsPage.ClickSortLohi();
        productsPage.checkSortLohi();
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
}
