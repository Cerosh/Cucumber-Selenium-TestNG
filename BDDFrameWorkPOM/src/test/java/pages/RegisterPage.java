package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	WebDriver driver;

	By firstNameTextBoxLocator = By.name("firstName");
	By lastNameTextBoxLocator = By.name("lastName");
	By phoneTextBoxLocator = By.name("phone");
	By emailTextBoxLocator = By.id("userName");
	By addressTextAreaLocator = By.name("address1");
	By cityTextBoxLocator = By.name("city");
	By stateTextBoxLocator = By.name("state");
	By postalcodeTextBoxLocator = By.name("postalCode");
	By countryDropDownLocator = By.name("country");
	By usernameTextBoxLocator = By.id("email");
	By passwordTextBoxLocator = By.name("password");
	By confirmPasswordTextBoxLocator = By.name("confirmPassword");
	By submitButtonLocator = By.name("register");

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void user_provides_first_name_as(String firstName) {
		driver.findElement(firstNameTextBoxLocator).sendKeys(firstName);

	}

	public void user_provides_the_last_name_as(String lastName) {
		driver.findElement(lastNameTextBoxLocator).sendKeys(lastName);

	}

	public void user_provides_the_phone_as(String phone) throws Throwable {
		driver.findElement(phoneTextBoxLocator).sendKeys(phone);
	}

	public void user_provides_the_email_as(String email) {
		driver.findElement(emailTextBoxLocator).sendKeys(email);

	}

	public void user_provides_the_address_as(String address) throws Throwable {
		driver.findElement(addressTextAreaLocator).sendKeys(address);
	}

	public void user_provides_the_city_as(String city) throws Throwable {
		driver.findElement(cityTextBoxLocator).sendKeys(city);
	}

	public void user_provides_the_state_as(String state) throws Throwable {
		driver.findElement(stateTextBoxLocator).sendKeys(state);
	}

	public void user_provides_the_postalCode_as(String postalCode) throws Throwable {
		driver.findElement(postalcodeTextBoxLocator).sendKeys(postalCode);
	}

	public void user_provides_the_country_as(String country) throws Throwable {
		driver.findElement(countryDropDownLocator).sendKeys(country);
	}

	public void user_provides_the_username_as(String username) throws Throwable {
		driver.findElement(usernameTextBoxLocator).sendKeys(username);
	}

	public void user_provides_the_password_as(String password) {
		driver.findElement(passwordTextBoxLocator).sendKeys(password);

	}

	public void user_provides_the_confirm_password_again_as(String password) {
		driver.findElement(confirmPasswordTextBoxLocator).sendKeys(password);

	}

	public void user_Submits_registration_form() {
		driver.findElement(submitButtonLocator).click();

	}

}
