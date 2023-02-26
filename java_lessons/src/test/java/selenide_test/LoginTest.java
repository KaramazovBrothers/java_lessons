package selenide_test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static selenide_test.WebUrls.LOGIN_URL;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        open(LOGIN_URL);
        $(By.id("user-name")).sendKeys("standard_user");
        $(By.id("password")).sendKeys("secret_sauce");
        $(By.id("login-button")).click();
        $(By.id("add-to-cart-sauce-labs-backpack")).click();
        $x("//a[@class='shopping_cart_link']").click();
        SelenideElement productLink = $x("//a[@id=\"item_4_title_link\"]").shouldBe(Condition.visible);
        Assert.isTrue(productLink.isDisplayed(),String.format("Element  %s isn`t displayed", productLink.getText()));
    }
}
