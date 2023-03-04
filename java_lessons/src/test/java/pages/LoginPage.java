package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static urls.WebUrls.LOGIN_URL;

public class LoginPage extends BasePage {
    private SelenideElement emailInputField = $(By.id("user-name"));
    private SelenideElement passwordInputField = $(By.id("password"));
    private SelenideElement loginButton = $(By.id("login-button"));
    private SelenideElement loginCredentials = $(By.xpath("//div[@class='login_credentials_wrap-inner']"));

    public void openPage () {
        open(LOGIN_URL);
    }

    public boolean CheckVisibleLoginCredentials() {
       return loginCredentials
                .isDisplayed();
    }

    public void inputEmail (String email) {
        emailInputField
                .shouldBe(visible)
                .sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordInputField
                .shouldBe(visible)
                .sendKeys(password);
    }

    public void clickLogin() {
        loginButton
                .shouldBe(enabled)
                .click();
    }

}
