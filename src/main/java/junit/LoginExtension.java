package junit;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import steps.AuthSteps;

public class LoginExtension implements BeforeEachCallback {

    @Override
    public void beforeEach(ExtensionContext context) {
        if (WebDriverRunner.hasWebDriverStarted()) {
            return;
        }

        AuthSteps authSteps = new AuthSteps();
        authSteps.login("i89xuuedwt@xkxkud.com", "BestPass7?Q");
    }
}
