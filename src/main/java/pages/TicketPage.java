package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TicketPage {
    private final SelenideElement cardNumberInput = $("input[name='card.cardNumber']");
    private final SelenideElement cardholderNameInput = $("input[name='card.cardHolder']");
    private final SelenideElement monthButton = $("#month");
    private final SelenideElement yearButton = $("#year");
    private final SelenideElement cvcInput = $("#cvc");
    private final SelenideElement payButton = $("button[data-qa-id='payment_submit_button']");
    private final SelenideElement successPayText = $x("//p[@class='text-xl mt-5']");


    /**
     * enter the card number
     *
     * @param cardNumber
     */
    public void setCardNumberInput(String cardNumber) {
        cardNumberInput.setValue(cardNumber);
    }

    /**
     * enter the cardholder Name
     *
     * @param cardholderName
     */
    public void setCardholderNameInput(String cardholderName) {
        cardholderNameInput.setValue(cardholderName);
    }

    /**
     * select a month
     *
     * @param month
     */
    public void selectMonthButton(String month) {
        monthButton.click();
        $x("//*[text() = '" + month + "']/parent::*[@class]").scrollIntoView(false).click();

    }

    /**
     * select a
     *
     * @param year year
     */
    public void selectYearButton(String year) {
        yearButton.click();
        $x("//*[text() = '" + year + "']/parent::*[@class]").scrollIntoView(false).click();
    }

    /**
     * enter the cvc code
     *
     * @param cvc
     */
    public void setCvcInput(String cvc) {
        cvcInput.setValue(cvc);
    }

    /**
     * submit Button Pay
     */
    public void clickPayButton() {
        payButton.click();
    }

    /**
     * Подтверждение успешной покупки
     *
     * @return
     */
    public SelenideElement getSuccessPayText() {
        return successPayText;
    }


}
