package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/java/features" }, glue = "steps")
// , tags = "@Signup-datatable-example"
public class RunCukesTest extends AbstractTestNGCucumberTests {

}
