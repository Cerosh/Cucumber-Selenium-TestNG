package utils;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver implements WebDriver {
	private WebDriver driver;
	private final String browser;

	public BrowserDriver(String browser) {
		this.browser = browser;
		this.driver = getDriver();
	}
	public WebDriver wrappedDriver() {
		return this.driver;
	}
	
	private WebDriver getDriver() {
		if (getBrowser().equalsIgnoreCase("chrome"))
			return new ChromeDriver();
		throw new IllegalArgumentException("unknown browser: " + getBrowser());
	}

	public JavascriptExecutor jsExecutor() {
		return (JavascriptExecutor) this.driver;
	}

	private String getBrowser() {
		return this.browser;
	}

	@Override
	public void get(String url) {
		this.driver.get(url);
	}

	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void quit() {
		driver.quit();

	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

}
