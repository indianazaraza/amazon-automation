package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {
    private WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public By byCss(String cssSelector){
        return By.cssSelector(cssSelector);
    }

    public boolean isDisplayed(By locator){
        return driver.findElement(locator).isDisplayed();
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }
}
