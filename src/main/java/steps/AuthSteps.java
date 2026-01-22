package steps;

import io.qameta.allure.Step;
import pages.LoginPage;

public class AuthSteps {
    private final LoginPage loginPage = new LoginPage();

    @Step("Логинемся")
    public AuthSteps loginStep(String email, String password) {
        loginPage.open()
                .setInputEmail(email)
                .setInputPassword(password)
                .clickButtonAuthLogin();
        System.out.println("Привет");
        return this;
    }
}
