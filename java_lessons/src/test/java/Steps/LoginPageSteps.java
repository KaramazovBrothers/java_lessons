package Steps;

import PrepareData.PrepareRegistrationData;
import models.LoginPageRegistrationModel;
import pages.LoginPage;

public class LoginPageSteps {
    private LoginPage loginPage = new LoginPage();

    public void login(String email, String password) {
        loginPage.openPage();
        loginPage.inputEmail(email);
        loginPage.inputPassword(password);
        loginPage.clickLogin();
    }

    public void loginWithoutPassword(String email) {
        loginPage.openPage();
        loginPage.inputEmail(email);
        loginPage.clickLogin();
    }

    public void loginWithoutEmail(String password) {
        loginPage.openPage();
        loginPage.inputPassword(password);
        loginPage.clickLogin();
    }

    public void fillInRegistrationFormFakeData(LoginPageRegistrationModel model) {
        loginPage.inputEmail(model.getLogin());
        loginPage.inputPassword(model.getPassword());
    }

    public void methodFake() {
        fillInRegistrationFormFakeData(PrepareRegistrationData.getDataFake());
    }

    public void fillInRegiastrationFormRealData(LoginPageRegistrationModel model) {
        loginPage.inputEmail(model.getLogin());
        loginPage.inputPassword(model.getPassword());
    }

    public void methodReal() {
        fillInRegiastrationFormRealData(PrepareRegistrationData.getWithDataFromLoginPage());
    }
}
