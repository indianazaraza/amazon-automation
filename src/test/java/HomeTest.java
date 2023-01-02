import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{
    @Test
    public void verifyTitle(){
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        Assert.assertEquals(homePage.getTitle(), expectedTitle);
    }

    @Test
    public void verifyLogo(){
        if (homePage.isLogoDisplayed()) homePage.redirectToHome();
        String expectedUrl = "https://www.amazon.com/ref=nav_logo";
        Assert.assertEquals(homePage.getUrl(), expectedUrl);
    }
}
