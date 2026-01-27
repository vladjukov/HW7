package steps;

import io.qameta.allure.Step;
import pages.MovieDetailsPage;

public class MovieDetailsSteps {
    MovieDetailsPage movieDetailsPage = new MovieDetailsPage();

    @Step("Купить билет")
    public TicketSteps navigateToPaymentStep() {
        movieDetailsPage.clickButtonPay();
        return new TicketSteps();
    }

    @Step
    public MovieDetailsPage reviewPublicStep (String review) {
        movieDetailsPage.setMovieReviewInput(review);
        movieDetailsPage.clickMovieReviewSubmitButton();
        return new MovieDetailsPage();
    }


}
