package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement emailInput = $("#email");
    private final SelenideElement passwordInput = $("#password");
    private final SelenideElement authLoginButton = $("button[data-qa-id='login_submit_button']");


    /**
     * open the authorization page
     *
     * @return
     */
    public LoginPage open() {
        Selenide.open("/login");
        return this;
    }

    /**
     * input email
     *
     * @param email
     */
    public LoginPage setEmailInput(String email) {
        emailInput.setValue(email);
        return this;
    }

    /**
     * input password
     *
     * @param password
     */
    public LoginPage setPasswordInput(String password) {
        passwordInput.setValue(password);
        return this;
    }

    /**
     * click on the button
     */
    public void clickAuthLoginButton() {
        authLoginButton.click();
    }


}
