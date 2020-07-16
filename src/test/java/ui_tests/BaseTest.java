package ui_tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import configuration.DriverConfiguration;

public class BaseTest {

	WebDriver driver;

	@BeforeSuite
	@Parameters({ "browser" })
	public void beforeSuite(String browser) {
		DriverConfiguration config = new DriverConfiguration(browser);
		driver = config.getDriver();
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

	@AfterTest
	public void afterTest() {
	}

}
