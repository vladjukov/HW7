package pages;

import static com.codeborne.selenide.Selenide.$x;


public class OpenMoviePage {


    public MovieDetailsPage clickSelectMovie(int index) {
        $x("//div[contains(@class, 'grid')]//a[" + index + "]").click();
        return new MovieDetailsPage();
    }
}