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
@Epic("Публикация отзыва")
@Feature("Вход в систему")
@Tag("Авторизация")
public class ReviewPublicationTest {

    @Test
    @Story("Пользователь вводит корректные данные")
    @DisplayName("Проверка логина позитивная")
    @Description("Проверка публикации отзыва")
    public void publicationReviewTest() {
        OpenMovieSteps openMovieSteps = new OpenMovieSteps();
        openMovieSteps.openMovieStep(9)
                .clickBuyButtonStep()
                .ticketSuccessStep()
                .clickButton();
        openMovieSteps.openMovieStep(9)
                .reviewPublicStep("Тестовый авто отзыв")
                .checkReviewVisible("Тестовый авто отзыв");
    }

}
