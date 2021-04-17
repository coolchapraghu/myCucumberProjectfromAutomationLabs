package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/AppFeatures/Uber.feature"},
        glue={"FeatureTestClasses"},
        //tags="@Regression and @Smoke",
        //tags="not @Smoke",
        tags="@Booking",
        plugin = {"pretty"}
)
public class UberTestRunner {
}
