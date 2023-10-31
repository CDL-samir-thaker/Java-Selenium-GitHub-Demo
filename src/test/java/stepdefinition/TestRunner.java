package stepdefinition;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/BDD"},
        glue={"stepdefinition"},
        plugin = {
                "pretty",
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html"},
        monochrome = true,
        dryRun = false,
        tags = "@smoke"

)
public class TestRunner {

}
