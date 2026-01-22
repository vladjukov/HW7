package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement inputEmail = $("#email");
    private final SelenideElement inputPassword = $("#password");
    private final SelenideElement buttonAuthLogin = $("button[data-qa-id='login_submit_button']");


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
    public LoginPage setInputEmail(String email) {
        inputEmail.setValue(email);
        return this;
    }

    /**
     * input password
     *
     * @param password
     */
    public LoginPage setInputPassword(String password) {
        inputPassword.setValue(password);
        return this;
    }

    /**
     * click on the button
     */
    public void clickButtonAuthLogin() {
        buttonAuthLogin.click();
    }


}
