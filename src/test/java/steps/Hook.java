package steps;

import base.BaseUtil;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Link;
import utils.Path;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Hook extends BaseUtil {

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", Path.chromeDriver);
        driver = new ChromeDriver();
        driver.get(Link.CART);
        extent = new ExtentReports();
        var spark = new ExtentSparkReporter("./"+Path.report);
        extent.attachReporter(spark);
    }

    @After
    public void tearDown() throws IOException {
        driver.quit();
        extent.flush();
        Desktop.getDesktop().browse(new File(Path.report).toURI());
    }
}