package steps;

import io.qameta.allure.Step;
import pages.MovieDetailsPage;
import pages.RecentMoviesPage;

public class ChooseMovieSteps {
    RecentMoviesPage recentMoviesPage = new RecentMoviesPage();

    @Step("выбираем фильм по индексу")
    public MovieDetailsSteps choose(int index) {
        recentMoviesPage.clickChooseMovie(index);
        return new MovieDetailsSteps();
    }
}
