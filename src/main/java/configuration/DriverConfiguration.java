package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverConfiguration {

	private WebDriver driver;
	private WebDriverWait wait;

	public DriverConfiguration() {

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

		wait = new WebDriverWait(driver, 10);

	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public WebDriverWait getWait() {
		return this.wait;
	}

}
