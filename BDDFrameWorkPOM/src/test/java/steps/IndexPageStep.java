package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import utils.DriverFactory;




public class IndexPageStep {
	private WebDriver driver;
	
	@Before
    public void beforeScenario() {
        driver = new DriverFactory().getDriver();
        System.out.println("This will run before the actual scenario");
    }
	@Given("^user is on index page$")
    public void setup() throws Throwable {
        driver.get("http://newtours.demoaut.com/index.php");
        driver.manage().window().maximize();
    }
	@After
    public void afterScenario() {
        new DriverFactory().destroyDriver();
        System.out.println("This will run after scneario is finished, even if it failed");
    }
	
}
