package runner;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"src/test/java/features"}, 
				glue = {"steps"}
		)

@Test
public class RunCukesTest extends AbstractTestNGCucumberTests {
	
	
}
