package steps;

import cucumber.api.java.en.And;
import pages.RegisterPage;
import utils.DriverFactory;

public class RegisterPageStep extends DriverFactory {

	@And("^user provides first name as ([^\"]*)$")
	public void user_provides_first_name_as(String firstName)  {
		new RegisterPage(driver).user_provides_first_name_as(firstName);
	}

	@And("^user provides last name as ([^\"]*)$")
	public void user_provides_the_last_name_as(String lastName)  {
		new RegisterPage(driver).user_provides_the_last_name_as(lastName);
	}

	@And("^user provides Phone as ([^\"]*)$")
	public void user_provides_the_phone_as(String phone) throws Throwable {
		new RegisterPage(driver).user_provides_the_phone_as(phone);
	}

	@And("^user provides email as ([^\"]*)$")
	public void user_provides_the_email_as(String email)  {
		new RegisterPage(driver).user_provides_the_email_as(email);
	}

	@And("^user provides address as ([^\"]*)$")
	public void user_provides_the_address_as(String address) throws Throwable {
		new RegisterPage(driver).user_provides_the_address_as(address);
	}

	@And("^user provides city as ([^\"]*)$")
	public void user_provides_the_city_as(String city) throws Throwable {
		new RegisterPage(driver).user_provides_the_city_as(city);
	}

	@And("^user provides state/Province as ([^\"]*)$")
	public void user_provides_the_state_as(String state) throws Throwable {
		new RegisterPage(driver).user_provides_the_state_as(state);
	}

	@And("^user provides postal Code as ([^\"]*)$")
	public void user_provides_the_postalcode_as(String postalcode) throws Throwable {
		new RegisterPage(driver).user_provides_the_postalcode_as(postalcode);
	}

	@And("^user selects country as ([^\"]*)$")
	public void user_provides_the_country_as(String country) throws Throwable {
		new RegisterPage(driver).user_provides_the_country_as(country);
	}

	@And("^user provides user name as ([^\"]*)$")
	public void user_provides_the_username_as(String username) throws Throwable {
		new RegisterPage(driver).user_provides_the_username_as(username);
	}

	@And("^user provides password as ([^\"]*)$")
	public void user_provides_the_password_as(String password) throws Throwable {
		new RegisterPage(driver).user_provides_the_password_as(password);
	}

	@And("^user provides the confirm password again as ([^\"]*)$")
	public void user_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
		new RegisterPage(driver).user_provides_the_confirm_password_again_as(confirmPassword);
	}

	@And("^user Submits registration form$")
	public void user_Submits_registration_form() throws Throwable {
		new RegisterPage(driver).user_Submits_registration_form();

	}

}
