package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReservationPage {
WebDriver driver;
	public ReservationPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isSignOffLinkDisplayed() {
		System.out.println("In the page");
		return driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
	}

}
