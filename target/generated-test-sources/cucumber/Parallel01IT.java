import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"/Users/chris/dev/seleniumdocker/JavaCucumberFramework/src/test/resources/features/home.feature"},
        plugin = {"json:/Users/chris/dev/seleniumdocker/JavaCucumberFramework/target/cucumber-parallel/1.json", "html:/Users/chris/dev/seleniumdocker/JavaCucumberFramework/target/cucumber-parallel/1"},
        monochrome = false,
        tags = {},
        glue = {"steps"})
public class Parallel01IT {
}
