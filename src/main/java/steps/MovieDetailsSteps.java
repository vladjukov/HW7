package steps;

import io.qameta.allure.Step;
import pages.MovieDetailsPage;

public class MovieDetailsSteps {
    MovieDetailsPage movieDetailsPage = new MovieDetailsPage();

    @Step("покупаем билет")
    public PayTicketSteps pay() {
        movieDetailsPage.clickButtonPay();
        return new PayTicketSteps();
    }
}
