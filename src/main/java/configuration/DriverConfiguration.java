package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverConfiguration {
	String browser;
	protected static WebDriver driver;

	public DriverConfiguration(String browser) {
		this.browser = browser;
		configureDriver();
	}

	private void configureDriver() {

		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/WebDriverExecutables/chromedriver");
			ChromeOptions cOptions = new ChromeOptions();
			driver = new ChromeDriver(cOptions);
			break;

		case "firefox":
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/WebDriverExecutables/geckodriver");
			FirefoxOptions fOptions = new FirefoxOptions();
			driver = new FirefoxDriver(fOptions);
			break;

		}
	}

	public WebDriver getDriver() {
		return driver;
	}

}
