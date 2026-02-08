package steps;

import io.qameta.allure.Step;
import pages.LoginPage;

public class AuthSteps {
    private final LoginPage loginPage = new LoginPage();

    @Step("Логинемся")
    public AuthSteps login(String email, String password) {
        loginPage.open()
                .setEmailInput(email)
                .setPasswordInput(password)
                .clickAuthLoginButton();
        return this;
    }
}
