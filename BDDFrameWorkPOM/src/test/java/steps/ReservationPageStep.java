package steps;


import org.testng.Assert;

import cucumber.api.java.en.Then;
import pages.ReservationPage;
import utils.DriverFactory;

public class ReservationPageStep extends DriverFactory{
	
	
	@Then("^User should be signed in$")
	public void user_should_be_signed_in() throws Throwable {
		 Assert.assertTrue(new ReservationPage(driver).isSignOffLinkDisplayed());
	}

}
