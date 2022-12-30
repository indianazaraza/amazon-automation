package pages;

import locators.Home;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoDisplayed(){
        return isDisplayed(byCss(Home.logo));
    }
}
