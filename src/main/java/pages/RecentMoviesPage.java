package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;


public class RecentMoviesPage {

    private final ElementsCollection ChooseMovie = $$x("//div[contains(@class, 'grid')]//a");


    public MovieDetailsPage clickChooseMovie(int index) {
        $x("//div[contains(@class, 'grid')]//a["+ index +"]");
        return new MovieDetailsPage();
    }
}