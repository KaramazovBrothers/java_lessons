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

    public static LoginPageRegistrationModel getWithDataFromLoginPage() {
        return LoginPageRegistrationModel
                .builder()
                .login(LoginPage.getLogin())
                .password(LoginPage.getPassword())
                .build();
    }
}
