package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MovieDetailsPage {
    private final SelenideElement buttonPay = $x("//button[.//p[text()='Купить билет']]");
    private final SelenideElement movieReviewInput = $("textarea[data-qa-id='movie_review_input']");
    private final SelenideElement movieReviewSubmitButton = $("button[data-qa-id='movie_review_submit_button']");


    /**
     * Нажать на кнопку Купить
     *
     * @return
     */
    public TicketPage clickButtonPay() {
        buttonPay.click();
        return new TicketPage();
    }

    /**
     * Написать отзыв к фильму
     *
     * @param review
     */
    public void setMovieReviewInput(String review) {
        movieReviewInput.setValue(review);
    }

    /**
     * Нажать на кнопку Отправить
     */
    public void clickMovieReviewSubmitButton() {
        movieReviewSubmitButton.click();
    }


}
