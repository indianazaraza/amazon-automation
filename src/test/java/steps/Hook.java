package steps;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Link;
import utils.Path;

public class Hook extends BaseUtil {

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", Path.chromeDriver);
        driver = new ChromeDriver();
        driver.get(Link.CART);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}