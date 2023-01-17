package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CartPage;
import utils.Link;

public class BaseStepDefs {
    private WebDriver driver;
    protected CartPage cartPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/home/maca/chromedriver");
        driver = new ChromeDriver();
        driver.get(Link.CART);
        cartPage = new CartPage(driver);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
