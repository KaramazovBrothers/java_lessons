package PrepareData;

import Utilities.TestDataGenerator;
import models.LoginPageRegistrationModel;
import pages.LoginPage;

public class PrepareRegistrationData {

    public static LoginPageRegistrationModel getDataFake() {
        return LoginPageRegistrationModel
                .builder()
                .login(TestDataGenerator.generateLogin())
                .password(TestDataGenerator.generatePassword())
                .build();
    }

//забираем параметры логина со страницы и логинимся со случайными валидными кредами
    public static LoginPageRegistrationModel getWithDataFromLoginPage() {
        return LoginPageRegistrationModel
                .builder()
                .login(LoginPage.getLogin())
                .password(LoginPage.getPassword())
                .build();
    }

//хардкодим параметры со страницы
    public static LoginPageRegistrationModel getWithDataFromLoginPageOne() {
        return LoginPageRegistrationModel
                .builder()
                .login("standard_user")
                .password("secret_sauce")
                .build();
    }

    public static LoginPageRegistrationModel getWithDataFromLoginPageTwo() {
        return LoginPageRegistrationModel
                .builder()
                .login("locked_out_user")
                .password("secret_sauce")
                .build();
    }

    public static LoginPageRegistrationModel getWithDataFromLoginPageThree() {
        return LoginPageRegistrationModel
                .builder()
                .login("problem_user")
                .password("secret_sauce")
                .build();
    }

    public static LoginPageRegistrationModel getWithDataFromLoginPageFour() {
        return LoginPageRegistrationModel
                .builder()
                .login("performance_glitch_user")
                .password("secret_sauce")
                .build();
    }
}
