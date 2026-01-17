package steps;

import io.qameta.allure.Step;
import pages.LoginPage;

public class AuthSteps {
    private final LoginPage loginPage = new LoginPage();

    @Step("Logging")
    public AuthSteps login(String email, String password) {
        loginPage.open()
                .setInputEmail(email)
                .setInputPassword(password)
                .clickButtonAuthLogin();
        return this;
    }
}
