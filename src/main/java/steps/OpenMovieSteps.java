package steps;

import io.qameta.allure.Step;
import pages.OpenMoviePage;

public class OpenMovieSteps {
    private final OpenMoviePage openMoviePage = new OpenMoviePage();

    @Step("Выбираем фильм по индексу")
    public MovieDetailsSteps selectMovie(int index) {
        openMoviePage.clickSelectMovie(index);
        return new MovieDetailsSteps();
    }

    @Step("Отфильтровать фильмы")
    public MovieDetailsSteps filterAndSelectMovie(String cityName, String genreFilm, String novelty, int index) {
        openMoviePage.clickAllMoviesButton()
                .selectCityFilter(cityName)
                .selectGenreFilter(genreFilm)
                .selectNoveltySorting(novelty)
                .clickSelectMovie(index);
        return new MovieDetailsSteps();
    }
}
