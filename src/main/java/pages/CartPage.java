package pages;

import ui.Home;
import org.openqa.selenium.WebDriver;

public class CartPage extends Page{

    public CartPage(WebDriver driver){
        super(driver);
    }

    public boolean isLogoDisplayed(){
        return isDisplayed(byCss(Home.LOGO));
    }

    public void redirectToHome(){
        click(byCss(Home.LOGO));
    }
}
