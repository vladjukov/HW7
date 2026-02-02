package steps;

import io.qameta.allure.Step;
import pages.TicketPage;

import static com.codeborne.selenide.Condition.visible;

public class TicketSteps {
    private final static String CARD_NUMBER = "4242424242424242";
    private final static String CARDHOLDER_NAME = "Vladik Marshal";
    private final static String MONTH = "Декабрь";
    private final static String YEAR = "2026";
    private final static String CVC = "123";

    TicketPage ticketPage = new TicketPage();

    @Step("Покупаем билет вводя валидные данные")
    public void ticketStep() {
        ticketPage.setCardNumberInput(CARD_NUMBER);
        ticketPage.setCardholderNameInput(CARDHOLDER_NAME);
        ticketPage.selectMonthButton(MONTH);
        ticketPage.selectYearButton(YEAR);
        ticketPage.setCvcInput(CVC);
        ticketPage.clickPayButton();
        ticketPage.getSuccessPayText().shouldBe(visible);
    }
    @Step("Покупаем билет вводя валидные данные")
    public OpenMovieSteps ticketSuccessStep() {
        ticketPage.setCardNumberInput(CARD_NUMBER);
        ticketPage.setCardholderNameInput(CARDHOLDER_NAME);
        ticketPage.selectMonthButton(MONTH);
        ticketPage.selectYearButton(YEAR);
        ticketPage.setCvcInput(CVC);
        ticketPage.clickPayButton();
        return new OpenMovieSteps();
    }
}
