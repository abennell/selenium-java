package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverConfiguration {

	public static WebDriver driver;
	public WebDriverWait wait;

	private static DriverConfiguration driverConfiguration;

	private DriverConfiguration() {

	}

	public static DriverConfiguration getInstance() {
		if (driverConfiguration == null) {
			driverConfiguration = new DriverConfiguration();
		}
		return driverConfiguration;
	}

	public void configureDriver(String browser) {

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

		wait = new WebDriverWait(driver, 30);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

}
