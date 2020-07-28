package ui_tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import configuration.DriverConfiguration;

public class BaseTest {

	protected WebDriver driver;

	@BeforeSuite
	@Parameters({ "browser", "appUrl" })
	public void beforeSuite(String browser, String appUrl) {
		DriverConfiguration.getInstance().configureDriver(browser);
		driver = DriverConfiguration.getInstance().getDriver();
		driver.navigate().to(appUrl);
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

	@AfterTest
	public void afterTest() {
	}

}
