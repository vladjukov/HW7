package steps;

import io.qameta.allure.Step;
import pages.OpenMoviePage;

import static com.codeborne.selenide.Selenide.$x;

public class OpenMovieSteps {
    OpenMoviePage openMoviePage = new OpenMoviePage();

    @Step("Выбираем фильм по индексу")
    public MovieDetailsSteps openMovieStep(int index) {
        openMoviePage.clickSelectMovie(index);
        return new MovieDetailsSteps();
    }
    @Step("Нажать кнопку Вернуться на главную")
    public OpenMoviePage clickButton() {
        $x("//button[@type='button' and text()='Вернуться на главную']").click();
        return new OpenMoviePage();
    }
}
