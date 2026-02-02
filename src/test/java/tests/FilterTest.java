package tests;


import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import junit.UITest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.OpenMovieSteps;

@UITest
@Epic("Фильтрация фильмов")
@Feature("Вход в систему")
@Tag("Авторизация")
public class FilterTest {

    @Test
    @Story("Пользователь вводит корректные данные")
    @DisplayName("Проверка логина позитивная")
    @Description("Проверка фильтрации фильма")
    public void checkingCorrectnessOfMovieFiltering() {
        OpenMovieSteps openMovieSteps = new OpenMovieSteps();
        openMovieSteps.filterMoviesStep("SPB", "Комедия", "Новые", 1)
                .checkingGenreAfterFiltering("Комедия");
    }
}
