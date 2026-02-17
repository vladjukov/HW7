package junit;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class SelenideExtension implements BeforeAllCallback, AfterEachCallback {


    @Override
    public void afterEach(ExtensionContext context) {
        Selenide.closeWebDriver();
    }

    @Override
    public void beforeAll(ExtensionContext context) {
        Configuration.browser = "chrome";
        Configuration.webdriverLogsEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.baseUrl = "https://cinescope.t-qa.ru";
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 5000;
        Configuration.pageLoadTimeout = 60000;
    }
}
