package tests;

import junit.UITest;
import org.junit.jupiter.api.Test;
import pages.TicketPage;

@UITest
public class TicketPurchaseTest {

    private final static String USER_EMAIL = "i89xuuedwt@xkxkud.com";
    private final static String USER_PASSWORD = "BestPass7?Q";
    private final static String CARD_NUMBER = "4242424242424242";
    private final static String CARDHOLDER_NAME = "Vladik Marshal";
    private final static String MONTH = "Декабрь";
    private final static String YEAR = "2026";
    private final static String CVC = "123";


    @Test
    public void ticketPayTest() {
        TicketPage ticketPage = new TicketPage();
        ticketPage.clickFilm();
        ticketPage.setInputCardNumber(CARD_NUMBER);
        ticketPage.setInputCardholderName(CARDHOLDER_NAME);
        ticketPage.submitButtonMonth(MONTH);
        ticketPage.submitButtonYear(YEAR);
        ticketPage.setInputCvc(CVC);
        ticketPage.submitButtonPay();
    }
}
