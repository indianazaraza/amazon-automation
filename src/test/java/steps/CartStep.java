package steps;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import utils.Link;
import static org.testng.Assert.assertEquals;

public class CartStep extends BaseUtil {
    private CartPage cartPage = new CartPage(driver);

    @Given("I am in the cart page")
    public void verifyUrlCartPage(){
        assertEquals(cartPage.getUrl(), Link.CART);
    }

    @When("I click the logo")
    public void clickLogo(){
        if (cartPage.isLogoDisplayed()) cartPage.redirectToHome();
    }

    @Then("I should return to the home page")
    public void verifyUrlHomePage(){
        assertEquals(cartPage.getUrl(), Link.HOME+"-/es/ref=nav_logo");
    }
}
