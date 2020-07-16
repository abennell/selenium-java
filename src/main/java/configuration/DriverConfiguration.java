package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverConfiguration {
	String browser;
	WebDriver driver;

	public DriverConfiguration(String browser) {
		this.browser = browser;
	}

	public WebDriver getDriver() {

		switch (browser) {
		case "chrome":
			ChromeOptions cOptions = new ChromeOptions();
			driver = new ChromeDriver(cOptions);
			break;

		case "firefox":
			FirefoxOptions fOptions = new FirefoxOptions();
			driver = new FirefoxDriver(fOptions);
			break;

		}

		return driver;
	}

}
