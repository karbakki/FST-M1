package TestRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"StepDefinition"},
        tags = "@activity1",
        plugin = {"pretty"},
        monochrome = true
)

public class ActivitiesRunner {
    //empty
}
