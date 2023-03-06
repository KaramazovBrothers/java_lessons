package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static urls.WebUrls.LOGIN_URL;

public class LoginPage extends BasePage {
    private SelenideElement emailInputField = $(By.id("user-name"));
    private SelenideElement passwordInputField = $(By.id("password"));
    private SelenideElement loginButton = $(By.id("login-button"));
    private SelenideElement loginCredentials = $(By.xpath("//div[@class='login_credentials_wrap-inner']"));
    private static ElementsCollection loginValues = $$(By.xpath("//div[@id='login_credentials']/text()"));
    private static ElementsCollection passwordValues = $$(By.xpath("//div[@class='login_password']/text()"));

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

    public static String getLogin() {
        ArrayList<String> loginCred = new ArrayList<String>();
        for(SelenideElement loginCreds: loginValues) {
            String loginText = loginCreds.getText();
            loginCred.add(loginText);
        }
        int randomIndex = (int) (Math.random() * loginCred.size());
        return loginCred.get(randomIndex);
    }

    //берём также массив, на случай, если список паролей будет расширяться
    public static String getPassword() {
        ArrayList<String> PasswordCred = new ArrayList<String>();
        for(SelenideElement passwordCreds: passwordValues) {
            String PasswordText = passwordCreds.getText();
            PasswordCred.add(PasswordText);
        }
        return getPassword();
    }


}
