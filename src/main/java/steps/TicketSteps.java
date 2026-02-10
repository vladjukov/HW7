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

    private final TicketPage ticketPage = new TicketPage();


    @Step("Заполнить данные карты")
    public TicketSteps fillCardDetailsAndPurchaseTicket(String cardNumber, String cardholderName, String month, String year, String cvc) {
        ticketPage.setCardNumberInput(cardNumber);
        ticketPage.setCardholderNameInput(cardholderName);
        ticketPage.selectMonthButton(month);
        ticketPage.selectYearButton(year);
        ticketPage.setCvcInput(cvc);
        ticketPage.clickPayButton();
        return this;
    }

    @Step("Заполнить карту валидными данными")
    public TicketSteps purchaseTicketWithValidCardData() {
        return fillCardDetailsAndPurchaseTicket(CARD_NUMBER, CARDHOLDER_NAME, MONTH, YEAR, CVC);
    }

    @Step("Проверить на успешность оплату")
    public void verifyPaymentSuccess() {
        ticketPage.getSuccessPayText().shouldBe(visible);
    }
}
