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
        Assert.assertTrue(homePage.isLogoDisplayed());
    }
}
