package steps;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CartPage;
import utils.Link;

public class CartStep extends BaseUtil {
    private CartPage cartPage = new CartPage(driver);

    @Given("I am in the cart page")
    public void verifyUrlCartPage(){
        Assert.assertEquals(cartPage.getUrl(), Link.CART);
    }

    @When("I click the logo")
    public void clickLogo(){
        if (cartPage.isLogoDisplayed()) cartPage.redirectToHome();
    }

    @Then("I should return to the home page")
    public void verifyUrlHomePage(){
        Assert.assertEquals(cartPage.getUrl(), Link.HOME+"-/es/ref=nav_logo");
    }
}
