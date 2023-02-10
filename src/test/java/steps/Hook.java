package steps;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Link;

public class Hook extends BaseUtil {
    private BaseUtil base;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/home/maca/chromedriver");
        base.driver = new ChromeDriver();
        base.driver.get(Link.CART);
    }

    @After
    public void tearDown(){
        base.driver.quit();
    }
}