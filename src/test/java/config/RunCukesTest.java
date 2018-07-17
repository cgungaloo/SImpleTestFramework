package config;

        import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = false,
        features = {"src/test/resources/features/"},
        dryRun = false,
        glue={"steps"}
//        ,tags = {"@Test"}
)
public class RunCukesTest {

}
