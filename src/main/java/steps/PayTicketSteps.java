package steps;

import io.qameta.allure.Step;
import pages.TicketPage;

public class PayTicketSteps {
    private final static String CARD_NUMBER = "4242424242424242";
    private final static String CARDHOLDER_NAME = "Vladik Marshal";
    private final static String MONTH = "Декабрь";
    private final static String YEAR = "2026";
    private final static String CVC = "123";

    TicketPage ticketPage = new TicketPage();

    @Step("Покупаем билет вводя валидные данные")
    public void payTicketStep() {
        ticketPage.setInputCardNumber(CARD_NUMBER);
        ticketPage.setInputCardholderName(CARDHOLDER_NAME);
        ticketPage.submitButtonMonth(MONTH);
        ticketPage.submitButtonYear(YEAR);
        ticketPage.setInputCvc(CVC);
        ticketPage.submitButtonPay();
    }
}
