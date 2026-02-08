package tests;

import io.qameta.allure.*;
import junit.UITest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.OpenMovieSteps;

@UITest
@Epic("Cinescope")
@Feature("Покупка билетов")
@Severity(SeverityLevel.CRITICAL)
@TmsLink("TEST-001")
public class TicketPurchaseTest {


    @Test
    @Story("Пользователь покупает билет на сеанс")
    @DisplayName("Покупка билета на фильм")
    @Description("Тестовый сценарий полной покупки")
    public void ticketPayTest() {
        OpenMovieSteps openMovieSteps = new OpenMovieSteps();
        openMovieSteps.selectMovie(2)
                .buyTicket()
                .enterTheCardDetailsAndClickTheBuyButton();
    }
}
