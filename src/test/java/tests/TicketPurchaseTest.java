package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import junit.UITest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.ChooseMovieSteps;
import steps.MovieDetailsSteps;
import steps.PayTicketSteps;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@UITest
@Epic("Покупка билета")
@Feature("Вход в систему")
@Tag("Авторизация")
public class TicketPurchaseTest {


    @Test
    @Story("Пользователь вводит корректные данные")
    @DisplayName("Проверка логина позитивная")
    @Description("Проверка успешной покупки с валидными данными")
    public void ticketPayTest() {
        ChooseMovieSteps chooseMovieSteps = new ChooseMovieSteps();
        MovieDetailsSteps movieDetailsSteps = new MovieDetailsSteps();
        PayTicketSteps payTicketSteps = new PayTicketSteps();
        chooseMovieSteps.chooseStep(2);
        movieDetailsSteps.payStep();
        payTicketSteps.payTicketStep();
        $(byText("Спасибо за покупку")).shouldBe(visible);
    }
}
