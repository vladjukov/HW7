package tests;


import io.qameta.allure.*;
import junit.UITest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.OpenMovieSteps;

@UITest
@Epic("Cinescope")
@Feature("Фильтрация контента")
@Severity(SeverityLevel.MINOR)
@TmsLink("TEST-003")
public class FilterTest {

    @Test
    @Story("Пользователь фильтрует фильмы")
    @DisplayName("Применение фильтров каталога")
    @Description("Проверка фильтрации фильма")
    public void checkingCorrectnessOfMovieFiltering() {
        OpenMovieSteps openMovieSteps = new OpenMovieSteps();
        openMovieSteps.filterAndSelectMovie("SPB", "Комедия", "Новые", 1)
                .verifyGenre("Комедия");
    }
}
