package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MovieDetailsPage {
    private final SelenideElement payButton = $x("//button[.//p[text()='Купить билет']]");
    private final SelenideElement movieReviewInput = $("textarea[data-qa-id='movie_review_input']");
    private final SelenideElement movieReviewSubmitButton = $("button[data-qa-id='movie_review_submit_button']");

    /**
     * Нажать на кнопку Купить
     *
     * @return
     */
    public TicketPage clickPayButton() {
        payButton.click();
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
     * метод для проверки отзыва
     *
     * @param review
     * @return
     */
    public SelenideElement getReviewByText(String review) {
        return $(byText(review));
    }

    /**
     * Нажать на кнопку Отправить
     */
    public void clickMovieReviewSubmitButton() {
        movieReviewSubmitButton.click();
    }

    /**
     * Получаем жанр фильма
     *
     * @param genreFilm
     * @return
     */
    public SelenideElement getGenreFilm(String genreFilm) {
        return $("p.text-lg.mt-5").shouldHave(text("Жанр:"), text(genreFilm));
    }

}
