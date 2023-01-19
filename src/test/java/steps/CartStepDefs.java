package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.Link;

public class CartStepDefs {

    BaseStepDefs stepData;

    @Given("I am in the cart page")
    public void verifyUrlCartPage(){
        Assert.assertEquals(stepData.cartPage.getUrl(), Link.CART);
    }

    @When("I click the logo")
    public void clickLogo(){
        if (stepData.cartPage.isLogoDisplayed()) stepData.cartPage.redirectToHome();
    }

    @Then("I should return to the home page")
    public void verifyUrlHomePage(){
        Assert.assertEquals(stepData.cartPage.getUrl(), Link.HOME+"ref=nav_logo");
    }
}
