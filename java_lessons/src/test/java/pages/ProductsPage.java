package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage extends BasePage {
    private SelenideElement productsHeader = $(new ByText("Products"));
    private SelenideElement addButtonBackpack = $(By.id("add-to-cart-sauce-labs-backpack"));
    private SelenideElement addButtonOnesie = $(By.id("add-to-cart-sauce-labs-onesie"));
    private SelenideElement checkoutLink = $(By.xpath("//a[@class='shopping_cart_link']"));
    private SelenideElement sortContainer = $(By.xpath("//*[@id='header_container']"));
    private SelenideElement sortLohi = $(By.xpath("//select[@class='product_sort_container']/option[@value='lohi']"));
    private SelenideElement sortHilo = $(By.xpath("//select[@class='product_sort_container']/option[@value='hilo']"));
    private ElementsCollection prices = $$(By.xpath("//*[@class='inventory_item_price']"));
    private SelenideElement burgerMenu = $(By.xpath("//*[@id='react-burger-menu-btn']"));
    private SelenideElement logout = $(By.xpath("//*[@id='logout_sidebar_link']"));


    public boolean checkHeader() {
        return productsHeader.isDisplayed();
    }

    public void ClickLogout() {
        logout
                .shouldBe(visible)
                .click();
    }

    public void ClickBurgerMenu() {
        burgerMenu
                .shouldBe(enabled)
                .click();
    }

    public void ClickAddToCardBackpack() {
        addButtonBackpack
                .shouldBe(enabled)
                .click();
    }

    public void ClickAddToCardOnesie() {
        addButtonOnesie
                .shouldBe(enabled)
                .click();
    }

    public void ClickToLinkCheckout() {
        checkoutLink
                .shouldBe(visible)
                .click();
    }

    public void ClickToSortContainer() {
        sortContainer
                .shouldBe(visible)
                .click();
    }

    public void ClickSortLohi() {
        sortLohi
                .shouldBe(visible)
                .click();
    }

    public void ClickSortHilo() {
        sortHilo
                .shouldBe(visible)
                .click();
    }

    public void checkSortLohi() {
        ArrayList<Double> priceValues = new ArrayList<Double>();
        for (SelenideElement elementPrice : prices) {
            String priceText = elementPrice.getText().replace("$", "");
            double i = Double.parseDouble(priceText);
            priceValues.add(i);
        }
        boolean isSorted = true;
        for (int i = 1; i < priceValues.size(); i++) {
            if (priceValues.get(i) < priceValues.get(i - 1)) {
                isSorted = false;
                break;
            }
        }
        Assert.assertTrue(isSorted, "Sort isn`t lohi");
    }

    public void checkSortHilo() {
        ArrayList<Double> priceValues = new ArrayList<Double>();
        for (SelenideElement elementPrice : prices) {
            String priceText = elementPrice.getText().replace("$", "");
            double i = Double.parseDouble(priceText);
            priceValues.add(i);
        }
        boolean isSorted = true;
        for (int i = 1; i < priceValues.size(); i++) {
            if (priceValues.get(i) > priceValues.get(i - 1)) {
                isSorted = false;
                break;
            }
        }
        Assert.assertTrue(isSorted, "Sort isn`t hilo");
    }
}
