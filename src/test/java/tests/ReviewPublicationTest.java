package tests;


import io.qameta.allure.*;
import junit.UITest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.OpenMovieSteps;

@UITest
@Epic("Cinescope")
@Feature("Отзывы пользователей")
@Severity(SeverityLevel.NORMAL)
@TmsLink("TEST-002")
public class ReviewPublicationTest {

    @Test
    @Story("Пользователь оставляет отзыв")
    @DisplayName("Публикация отзыа")
    @Description("Проверка публикации отзыва")
    public void publicationReviewTest() {
        OpenMovieSteps openMovieSteps = new OpenMovieSteps();
        openMovieSteps.selectMovie(1)
                .submitReview("Тестовый авто отзыв")
                .verifyReviewVisible("Тестовый авто отзыв");
    }

}
