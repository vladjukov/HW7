package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TicketPage {
    private final SelenideElement film = $("div[class='p-6 pt-0']");
    private final SelenideElement inputCardNumber = $("input[name='card.cardNumber']");
    private final SelenideElement inputCardholderName = $("input[name='card.cardHolder']");
    private final SelenideElement buttonMonth = $("#month");
    private final SelenideElement buttonYear = $("#year");
    private final SelenideElement inputCvc = $("#cvc");
    private final SelenideElement buttonPay = $("button[data-qa-id='payment_submit_button']");


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
        $x("//*[text() = '" + month + "']/parent::*[@class]").scrollIntoView(false).click();

    }

    /**
     * select a
     *
     * @param year year
     */
    public void submitButtonYear(String year) {
        buttonYear.click();
        $x("//*[text() = '" + year + "']/parent::*[@class]").scrollIntoView(false).click();
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
