package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	protected static WebDriver driver;

	public DriverFactory() {
		initialize();
	}

	private void initialize() {
		if (driver == null)
			createNewDriverInstance();
	}

	private void createNewDriverInstance() {
		driver = new ChromeDriver();

	}

	public WebDriver getDriver() {
		return driver;
	}

	public void destroyDriver() {
		driver.quit();
		driver = null;
	}

	
}
