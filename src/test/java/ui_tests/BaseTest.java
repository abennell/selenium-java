package ui_tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import configuration.DriverConfiguration;

public class BaseTest {

	DriverConfiguration config;

	@BeforeSuite
	@Parameters({ "browser", "appUrl" })
	public void beforeSuite(String browser, String appUrl) {
		DriverConfiguration config = new DriverConfiguration();
		config.configureDriver(browser);
		config.getDriver().navigate().to(appUrl);
	}

	@AfterSuite
	public void afterSuite() {
		config.getDriver().quit();
	}

	@AfterTest
	public void afterTest() {
	}

}
