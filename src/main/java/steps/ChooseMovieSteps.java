package steps;

import io.qameta.allure.Step;
import pages.RecentMoviesPage;

public class ChooseMovieSteps {
    RecentMoviesPage recentMoviesPage = new RecentMoviesPage();

    @Step("Выбираем фильм по индексу")
    public MovieDetailsSteps chooseStep(int index) {
        recentMoviesPage.clickChooseMovie(index);
        return new MovieDetailsSteps();
    }
}
