package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MovieDetailsPage {
    private final SelenideElement buttonPay = $x("//button[.//p[text()='Купить билет']]");

    public TicketPage clickButtonPay() {
        buttonPay.click();
        return new TicketPage();
    }
}
