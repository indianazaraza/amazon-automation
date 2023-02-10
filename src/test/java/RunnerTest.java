import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources",
        glue = "steps",
        monochrome = true,
        plugin = "pretty")
public class RunnerTest extends AbstractTestNGCucumberTests {
}