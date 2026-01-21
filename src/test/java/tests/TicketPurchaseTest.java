package tests;

import junit.UITest;
import org.junit.jupiter.api.Test;
import steps.ChooseMovieSteps;
import steps.MovieDetailsSteps;
import steps.PayTicketSteps;

@UITest
public class TicketPurchaseTest {


    @Test
    public void ticketPayTest() {
        ChooseMovieSteps chooseMovieSteps = new ChooseMovieSteps();
        MovieDetailsSteps movieDetailsSteps = new MovieDetailsSteps();
        PayTicketSteps payTicketSteps = new PayTicketSteps();
        chooseMovieSteps.choose(1);
        movieDetailsSteps.pay();
        payTicketSteps.payTicketStep();

    }
}
