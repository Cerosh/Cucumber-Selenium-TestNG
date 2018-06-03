package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void user_chooses_to_sign_up() {
		driver.findElement(By.linkText("REGISTER")).click();
		
	}

}
