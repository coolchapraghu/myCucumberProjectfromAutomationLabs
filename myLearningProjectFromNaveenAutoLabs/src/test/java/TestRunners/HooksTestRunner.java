package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/AppFeatures/HooksSearch.feature"},
        glue={"FeatureTestClasses", "HooksPackage"},
       // plugin = {"pretty"}
        plugin = {"pretty" ,
        "json:target/MyReports/report.json",
        "junit:target/MyReports/report.xml"},
        // publish = true
        // publishes report to https://reports.cucumber.io/ where you can view in browser nicely
        monochrome = false,
        dryRun = true // by default dryRun is set to false
                     // dryRun = true means if there are no step methods(glue code) defined
                     // for some steps, then those steps will be ignored
)

public class HooksTestRunner {
}
