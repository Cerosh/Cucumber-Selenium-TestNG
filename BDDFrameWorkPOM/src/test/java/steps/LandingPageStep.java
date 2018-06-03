package steps;

import cucumber.api.java.en.When;
import pages.LandingPage;
import utils.DriverFactory;

public class LandingPageStep extends DriverFactory{
	@When("^user chooses to sign up$")
    public void user_chooses_to_sign_up() {
        new LandingPage(driver).user_chooses_to_sign_up();
    }

}
