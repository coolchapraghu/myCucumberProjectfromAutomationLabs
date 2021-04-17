package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/AppFeatures/HooksSearch.feature"},
        glue={"FeatureTestClasses", "HooksPackage"},
        plugin = {"pretty"}
)

public class HooksTestRunner {
}
