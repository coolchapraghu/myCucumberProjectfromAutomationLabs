package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/AppFeatures/login.feature"},
        glue={"FeatureTestClasses"},
        plugin = {"pretty"},
        publish = true
)
public class LoginTestRunner {
}
