package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "F://nopCommerce_MavenJunit//Features//AddCustomer.feature",
        glue = "StepDefinitions",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty","html:target/test-output.html"}
)
public class TestRunner {
}
