package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class OpenMoviePage {
    private final SelenideElement allMoviesButton = $x("//a[text()='Все фильмы']");
    private final SelenideElement cityFilter = $(byAttribute("data-qa-id", "movies_filter_location_select")).closest("button");
    private final SelenideElement genreFilter = $x("//div[.//span[@data-qa-id='movies_filter_location_select']]/following-sibling::div//button");
    private final SelenideElement noveltySorting = $(byAttribute("data-qa-id", "movies_filter_created_at_select")).closest("button");

    /**
     * Выбираем фильм по индексу
     *
     * @param index
     * @return
     */
    public MovieDetailsPage clickSelectMovie(int index) {
        $x("//div[contains(@class, 'grid')]//a[" + index + "]").click();
        return new MovieDetailsPage();
    }

    /**
     * Нажимаем на кнопку Все фильмы
     *
     * @return
     */
    public OpenMoviePage clickAllMoviesButton() {
        allMoviesButton.click();
        return this;
    }

    /**
     * Выбираем город
     *
     * @param cityName
     */
    public OpenMoviePage selectCityFilter(String cityName) {
        cityFilter.shouldBe(visible).click();
        $(byText(cityName)).shouldBe(visible).click();
        return this;
    }

    /**
     * Выбираем жанр фильма
     *
     * @param genreFilm
     */
    public OpenMoviePage selectGenreFilter(String genreFilm) {
        genreFilter.click();
        $(byText(genreFilm)).click();
        return this;
    }

    /**
     * Сортируем по новизне
     *
     * @param novelty
     */
    public OpenMoviePage selectNoveltySorting(String novelty) {
        noveltySorting.click();
        $$("[role='option']").find(text(novelty)).click();
        return this;
    }
}