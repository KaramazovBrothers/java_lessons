package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage extends BasePage {
    private SelenideElement backpackInCheckout = $(By.xpath("//a[@id='item_4_title_link']"));
    private SelenideElement onesieInCheckout = $(By.xpath("//a[@id='item_2_title_link']"));
    private SelenideElement removeButton = $(By.xpath("//*[@id='remove-sauce-labs-backpack']"));

    public boolean checkBackPackInCheckout() {
        return backpackInCheckout
                .isDisplayed();
    }

    public void checkNotVisibleBackPackInCheckout() {
        backpackInCheckout
                .shouldNotBe(visible);
    }

    public boolean checkOnesieInCheckout() {
        return onesieInCheckout
                .isDisplayed();
    }

    public void clickRemoveBackpack() {
        removeButton
                .shouldBe(enabled)
                .click();
    }
}


