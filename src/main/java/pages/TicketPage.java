package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TicketPage {
    private final SelenideElement film = $("div[class='p-6 pt-0']");
    private final SelenideElement inputCardNumber = $("#card.cardNumber");
    private final SelenideElement inputCardholderName = $("#card.cardholderName");
    private final SelenideElement buttonMonth = $("#month");
    private final SelenideElement buttonYear = $("#year");
    private final SelenideElement inputCvc = $("#cvc");
    private final SelenideElement buttonPay = $("button[data-qa-id='payment_submit_button']");


    /**
     * open the ticket pay page
     *
     * @return
    public static TicketPage open() {
        Selenide.open("/movies/961");
        return new TicketPage();
    }


    public void clickFilm() {
        film.click();
    }*/

    /**
     * enter the card number
     *
     * @param cardNumber
     */
    public void setInputCardNumber(String cardNumber) {
        inputCardNumber.setValue(cardNumber);
    }

    /**
     * enter the cardholder Name
     *
     * @param cardholderName
     */
    public void setInputCardholderName(String cardholderName) {
        inputCardholderName.setValue(cardholderName);
    }

    /**
     * select a month
     *
     * @param month
     */
    public void submitButtonMonth(String month) {
        buttonMonth.click();
        SelenideElement monthSelect = $$(".p-1 h-[var(--radix-select-trigger-height)] w-full min-w-[var(--radix-select-trigger-width)]")
                .findBy(text(month));
    }

    /**
     * select a
     *
     * @param year year
     */
    public void submitButtonYear(String year) {
        buttonYear.click();
        SelenideElement yearSelect = $$(".p-1 h-[var(--radix-select-trigger-height)] w-full min-w-[var(--radix-select-trigger-width)]")
                .findBy(text(year));
    }

    /**
     * enter the cvc code
     *
     * @param cvc
     */
    public void setInputCvc(String cvc) {
        inputCvc.setValue(cvc);
    }

    /**
     * submit Button Pay
     */
    public void submitButtonPay() {
        buttonPay.click();
    }


}
