package steps;

import base.BaseUtil;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import utils.Link;
import static org.testng.Assert.assertEquals;

public class CartStep extends BaseUtil {
    private CartPage cartPage = new CartPage(driver);
    private ExtentTest feature = extent.createTest(Feature.class, "CartPage - Logo");
    private ExtentTest scenario = feature.createNode(Scenario.class, "Return to the home page");

    @Given("^I am in the cart page$")
    public void verifyUrlCartPage() throws ClassNotFoundException {
        assertEquals(cartPage.getUrl(), Link.CART);
        scenario.createNode(new GherkinKeyword("Given"), "I am in the cart page")
                .pass("pass");
    }

    @When("^I click the logo$")
    public void clickLogo() throws ClassNotFoundException {
        if (cartPage.isLogoDisplayed()) cartPage.redirectToHome();
        scenario.createNode(new GherkinKeyword("When"), "I click the logo")
                .info("info");
    }

    @Then("^I should return to the home page$")
    public void verifyUrlHomePage() throws ClassNotFoundException {
        assertEquals(cartPage.getUrl(), Link.HOME+"-/es/ref=nav_logo");
        scenario.createNode(new GherkinKeyword("Then"), "I should return to the home page")
                .pass("pass");
    }
}
