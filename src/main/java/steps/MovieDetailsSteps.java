package steps;

import io.qameta.allure.Step;
import pages.MovieDetailsPage;

import static com.codeborne.selenide.Condition.visible;

public class MovieDetailsSteps {
    MovieDetailsPage movieDetailsPage = new MovieDetailsPage();

    @Step("Купить билет")
    public TicketSteps clickBuyButtonStep() {
        movieDetailsPage.clickPayButton();
        return new TicketSteps();
    }

    @Step("Оставить отзыв")
    public MovieDetailsSteps reviewPublicStep (String review) {
        movieDetailsPage.setMovieReviewInput(review);
        movieDetailsPage.clickMovieReviewSubmitButton();
        return this;
    }

    @Step("Проверяем, что отзыв виден на странице")
    public MovieDetailsSteps checkReviewVisible(String review) {
        movieDetailsPage.getReviewByText(review)
                .scrollIntoView(false)
                .shouldBe(visible);
        return this;
    }

    @Step("Проверка жанра фильма после фильтрации")
    public MovieDetailsSteps checkingGenreAfterFiltering(String expectedGenre) {
        movieDetailsPage.getGenreFilm(expectedGenre).shouldBe(visible);
        return this;
    }


}
